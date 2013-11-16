package week2

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	object sim extends Circuits with Parameters
	import sim._
	
	val in1, in2, sum, carry = new Wire       //> in1  : week2.test.sim.Wire = week2.Gates$Wire@9695ed7
                                                  //| in2  : week2.test.sim.Wire = week2.Gates$Wire@64d17a14
                                                  //| sum  : week2.test.sim.Wire = week2.Gates$Wire@74a5eac1
                                                  //| carry  : week2.test.sim.Wire = week2.Gates$Wire@38d760bb
  halfAdder(in1, in2, sum, carry)
  probe("sum", sum)                               //> sum 0 new-value = false
  probe("carry", carry)                           //> carry 0 new-value = false


	in1 setSignal true
	run()                                     //> *** simulation started, time = 0 ***
                                                  //| sum 8 new-value = true
	in2 setSignal(true)
	run                                       //> *** simulation started, time = 8 ***
                                                  //| carry 11 new-value = true
                                                  //| sum 16 new-value = false
  in1 setSignal false
  run                                             //> *** simulation started, time = 16 ***
                                                  //| carry 19 new-value = false
                                                  //| sum 24 new-value = true
}