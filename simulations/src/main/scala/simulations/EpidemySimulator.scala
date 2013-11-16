package simulations

import math.random

class EpidemySimulator extends Simulator {

  def randomBelow(i: Int) = (random * i).toInt

  protected[simulations] object SimConfig {

    val population: Int = 300
    val roomRows: Int = 8
    val roomColumns: Int = 8

    val incubationTime = 6
    val dieTime = 14
    val immuneTime = 16
    val healTime = 18

    val prevalenceRate = 0.01
    val transRate = 0.4
    val dieRate = 0.25
  }

  import SimConfig._

  val persons: List[Person] = {
    val p = (for (i <- 1 to SimConfig.population) yield new Person(i)).toList
    val numInfected = (SimConfig.prevalenceRate * SimConfig.population).toInt
    for (i <- 0 until numInfected) { infect(p(i)) }
    p
  }

  private def infect(p: Person) = {
    if (!p.infected && !p.immune) {
      p.infected = true
      afterDelay(SimConfig.incubationTime) {
        p.sick = true
      }
      for (i <- 0 until (SimConfig.immuneTime - SimConfig.dieTime)) {
        afterDelay(SimConfig.dieTime + i) {
          if (random <= SimConfig.dieRate) {
            p.dead = true
          }
        }
      }

      afterDelay(SimConfig.immuneTime) {
        if (!p.dead) {
          p.immune = true
          p.sick = false
          afterDelay(SimConfig.healTime - SimConfig.immuneTime) {
            p.infected = false
            p.sick = false
            p.immune = false
            p.dead = false
          }
        }
      }
    }
  }

  class Person(val id: Int) {
    var infected = false
    var sick = false
    var immune = false
    var dead = false

    // demonstrates random number generation
    var row: Int = randomBelow(roomRows)
    var col: Int = randomBelow(roomColumns)

    afterDelay(1 + randomBelow(5))(moveAction(id))
  }

  
  
  sealed abstract class Move
  case object Left extends Move
  case object Right extends Move
  case object Up extends Move
  case object Down extends Move

  def moves = List(Left, Right, Up, Down)

  type Pos = Pair[Int, Int]

  private def neighbours(p: Pos): List[Pos] = moves.map(m => neighbourByMove(p, m))

  private def neighbourByMove(p: Pos, m: Move): Pos = m match {
    case Left => if (p._1 == 0) (SimConfig.roomColumns - 1, p._2) else (p._1 - 1, p._2)
    case Right => if (p._1 == SimConfig.roomColumns - 1) (0, p._2) else (p._1 + 1, p._2)
    case Up => if (p._2 == 0) (p._1, SimConfig.roomRows - 1) else (p._1, p._2 - 1)
    case Down => if (p._2 == SimConfig.roomRows - 1) (p._1, 0) else (p._1, p._2 + 1)
  }

  private def moveToNeighbour(p: Person) = {
    val n = neighbours(p.col, p.row) filterNot isRoomVisiblyInfectiuos
    if (!n.isEmpty) {
      val chosen = n(randomBelow(n.length))
      p.col = chosen._1
      p.row = chosen._2
    }
  }

  private def isRoomVisiblyInfectiuos(pos: Pos): Boolean = {
    val per = persons filter (p => p.col == pos._1 && p.row == pos._2)
    (per filter (p => p.sick || p.dead)).length != 0
  }

  private def isRoomInfectiuos(pos: Pos): Boolean = {
    val per = persons filter (p => p.col == pos._1 && p.row == pos._2)
    (per filter (p => p.infected)).length != 0
  }

  private def moveAction(id: Int): Unit = {
    val p: Person = persons.find(x => x.id == id).get
    if (!p.dead) {
      moveToNeighbour(p)
      if (isRoomInfectiuos(p.col, p.row) && random < SimConfig.transRate) infect(p)
      afterDelay(1 + randomBelow(5))(moveAction(p.id))
    }
  }
}
