package week7


object streams {

	(1 to 1000).toStream                      //> res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)


	((1000 to 10000).toStream)                //> res1: scala.collection.immutable.Stream[Int] = Stream(1000, ?)


	// x #:: xs === Stream(x,xs)
}