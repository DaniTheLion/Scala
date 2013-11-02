package funsets
import FunSets._

object set_test {
	val x = 3                                 //> x  : Int = 3
  val s1 = singletonSet(1)                        //> s1  : Int => Boolean = <function1>
	val s2 = singletonSet(2)                  //> s2  : Int => Boolean = <function1>
	contains(union(s1,s2),3)                  //> res0: Boolean = false
	
	println(s2)                               //> <function1>
}