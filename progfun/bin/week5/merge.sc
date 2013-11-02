package week5
import math.Ordering

object merge {
	//implicit parameter (ordering function)
	def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
		val n = xs.length / 2
		if ( n == 0 ) xs
		else{
			def merge(xs: List[T], ys: List[T]): List[T] = (xs,ys) match {
				case(Nil, ys) => ys
 				case(xs, Nil) => xs
 				case (x :: xs1, y :: ys1) =>
 					if (ord.lt(x,y)) y :: merge(xs,ys1)
 					else x :: merge(xs1,ys)
			 }
			val (fst,snd) = xs splitAt n
			merge(msort(fst), msort(snd))
		
		}
	}                                         //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]


val nums = List(2,-4,5,7,1,8)                     //> nums  : List[Int] = List(2, -4, 5, 7, 1, 8)
val fruits = List("apple", "pinapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pinapple, orange, banana)



msort(nums)(Ordering.Int)                         //> res0: List[Int] = List(8, 7, 5, 2, 1, -4)
//No need to write argument types:
msort(fruits)                                     //> res1: List[String] = List(pinapple, orange, banana, apple)
}