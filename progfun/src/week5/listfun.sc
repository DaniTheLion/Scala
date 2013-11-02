package week5

object listfun {
  val nums = List(2,-4,5,7,1,8)                   //> nums  : List[Int] = List(2, -4, 5, 7, 1, 8)
	val fruits = List("apple", "pinapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pinapple, orange, banana)



	nums.filterNot(x => x > 0)                //> res0: List[Int] = List(-4)

	//super cool, return a list for which the condition holds and a list for which it doesn't.
	nums.partition(x => x > 0)                //> res1: (List[Int], List[Int]) = (List(2, 5, 7, 1, 8),List(-4))

	//longset prefix for which the predicate is true:
	nums.takeWhile(x => x > 0)                //> res2: List[Int] = List(2)

	//the remainder without the elements taken by takeWhile
	nums.dropWhile(x => x > 0)                //> res3: List[Int] = List(-4, 5, 7, 1, 8)
	
	//combination of takeWhile and dropWhile
	nums.span(x => x > 0)                     //> res4: (List[Int], List[Int]) = (List(2),List(-4, 5, 7, 1, 8))





	def pack[T](xs: List[T]): List[List[T]] = xs match
	{
		case Nil => Nil
		case x :: xs1 =>
			val (first, rest) = xs span(y => y == x)
			first :: pack(rest)
	}                                         //> pack: [T](xs: List[T])List[List[T]]
	
	pack(List("a","a","a","b","c","c","a"))   //> res5: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
	
	
	def encode[T](xs: List[T]): List[(T, Int)] =
		pack(xs) map (l => (l.head, l.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]
  
  
  encode(List("a","a","a","b","c","c","a"))       //> res6: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
  
  
  def concat[T](xs: List[T], ys: List[T]): List[T] =
  	(xs foldRight ys)(_ :: _)                 //> concat: [T](xs: List[T], ys: List[T])List[T]
  
  concat(List(1,2,3,4), List(5,6,7,8))            //> res7: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())(f(_) :: _)           //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
    
    
 	mapFun[Int, Int](List(1,2,3), (z => z*z)) //> res8: List[Int] = List(1, 4, 9)


	def lengthFun[T](xs: List[T]): Int = (xs foldRight 0)((_, l) => l + 1)
                                                  //> lengthFun: [T](xs: List[T])Int

	lengthFun(List(1,2,3,4,5))                //> res9: Int = 5

}