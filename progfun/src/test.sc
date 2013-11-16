

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val f: PartialFunction[String,String] = {case "ping" => "pong"}
                                                  //> f  : PartialFunction[String,String] = <function1>

	 
	f("ping")                                 //> res0: String = pong
	f.isDefinedAt("ping")                     //> res1: Boolean = true
	f.isDefinedAt("abc")                      //> res2: Boolean = false


	val N = 5                                 //> N  : Int = 5
	
	val m = for {
		x <- 2 to N
		y <- 2 to x
		if (x % y == 0)
	} yield (x,y)                             //> m  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,2), (3,3)
                                                  //| , (4,2), (4,4), (5,5))

}