package week7


object streams {

	(1 to 1000).toStream                      //> res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)


	((1000 to 10000).toStream)                //> res1: scala.collection.immutable.Stream[Int] = Stream(1000, ?)


	// x #:: xs === Stream(x,xs)


	val c = Vector(Vector('a','b','c'), Vector('d','e','f'), Vector('g','h'))
                                                  //> c  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Cha
                                                  //| r]] = Vector(Vector(a, b, c), Vector(d, e, f), Vector(g, h))
  c(0)(0)                                         //> res2: Char = a

}