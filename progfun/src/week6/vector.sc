package week6


object vector {
	//SEQ includes vector, list, range
	//Vector complexity:
	//Adding an element - LOG_32(N)

	val nums = Vector(1,55,3,4)               //> nums  : scala.collection.immutable.Vector[Int] = Vector(1, 55, 3, 4)
	nums :+ 100                               //> res0: scala.collection.immutable.Vector[Int] = Vector(1, 55, 3, 4, 100)


	val xs = Array(1,2,3,44)                  //> xs  : Array[Int] = Array(1, 2, 3, 44)
	
	xs map (x => x*2)                         //> res1: Array[Int] = Array(2, 4, 6, 88)
	
	
	val s = "Hello World"                     //> s  : String = Hello World
	s filter(c => c.isLower)                  //> res2: String = elloorld

	val r: Range = 1 until 5                  //> r  : Range = Range(1, 2, 3, 4)
	val t: Range = 1 to 5                     //> t  : Range = Range(1, 2, 3, 4, 5)
	
	1 to 10 by 3                              //> res3: scala.collection.immutable.Range = Range(1, 4, 7, 10)
	6 to 0 by -2                              //> res4: scala.collection.immutable.Range = Range(6, 4, 2, 0)

	s exists (c => c.isUpper)                 //> res5: Boolean = true
	s forall (c => c.isUpper)                 //> res6: Boolean = false
	
	val pairs = List(1,2,3) zip s             //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
	pairs unzip                               //> res7: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
	
	
	//Applies collection-valued function f to all elements of xs and concatenates the results:
	s flatMap (c => List('.',c))              //> res8: String = .H.e.l.l.o. .W.o.r.l.d
	
	xs.sum                                    //> res9: Int = 50
	xs.max                                    //> res10: Int = 44
	
	val M = 10                                //> M  : Int = 10
	val N = 5                                 //> N  : Int = 5
	
	//All combinations
	(1 to M) flatMap (x => (1 to N) map (y => (x,y)))
                                                  //> res11: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,
                                                  //| 2), (1,3), (1,4), (1,5), (2,1), (2,2), (2,3), (2,4), (2,5), (3,1), (3,2), (3
                                                  //| ,3), (3,4), (3,5), (4,1), (4,2), (4,3), (4,4), (4,5), (5,1), (5,2), (5,3), (
                                                  //| 5,4), (5,5), (6,1), (6,2), (6,3), (6,4), (6,5), (7,1), (7,2), (7,3), (7,4), 
                                                  //| (7,5), (8,1), (8,2), (8,3), (8,4), (8,5), (9,1), (9,2), (9,3), (9,4), (9,5),
                                                  //|  (10,1), (10,2), (10,3), (10,4), (10,5))
	def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map(xy => xy._1 * xy._2).sum
                                                  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
	
	scalarProduct(Vector(1,0,1,0), Vector(1,0,1,0))
                                                  //> res12: Double = 2.0
	
//	def isPrime(n: Int): Boolean = (2 until n).filter(x => n % x == 0).length == 0
	
	def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d !=0)
                                                  //> isPrime: (n: Int)Boolean
		
	isPrime(29)                               //> res13: Boolean = true

	val n = 21                                //> n  : Int = 21
	
}