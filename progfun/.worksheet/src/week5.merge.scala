package week5
import math.Ordering

object merge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(512); 
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
	};System.out.println("""msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]""");$skip(32); 


val nums = List(2,-4,5,7,1,8);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(59); 
val fruits = List("apple", "pinapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(29); val res$0 = 



msort(nums)(Ordering.Int);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(49); val res$1 = 
//No need to write argument types:
msort(fruits);System.out.println("""res1: List[String] = """ + $show(res$1))}
}
