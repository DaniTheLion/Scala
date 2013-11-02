package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  printSet(union(singletonSet(88),singletonSet(9)))
}
