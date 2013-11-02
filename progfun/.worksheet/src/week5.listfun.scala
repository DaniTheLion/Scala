package week5

object listfun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val nums = List(2,-4,5,7,1,8);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(60); 
	val fruits = List("apple", "pinapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(31); val res$0 = 



	nums.filterNot(x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(121); val res$1 = 

	//super cool, return a list for which the condition holds and a list for which it doesn't.
	nums.partition(x => x > 0);System.out.println("""res1: (List[Int], List[Int]) = """ + $show(res$1));$skip(80); val res$2 = 

	//longset prefix for which the predicate is true:
	nums.takeWhile(x => x > 0);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(86); val res$3 = 

	//the remainder without the elements taken by takeWhile
	nums.dropWhile(x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(67); val res$4 = 
	
	//combination of takeWhile and dropWhile
	nums.span(x => x > 0);System.out.println("""res4: (List[Int], List[Int]) = """ + $show(res$4));$skip(167); 





	def pack[T](xs: List[T]): List[List[T]] = xs match
	{
		case Nil => Nil
		case x :: xs1 =>
			val (first, rest) = xs span(y => y == x)
			first :: pack(rest)
	};System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(43); val res$5 = 
	
	pack(List("a","a","a","b","c","c","a"));System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(91); 
	
	
	def encode[T](xs: List[T]): List[(T, Int)] =
		pack(xs) map (l => (l.head, l.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(50); val res$6 = 
  
  
  encode(List("a","a","a","b","c","c","a"));System.out.println("""res6: List[(String, Int)] = """ + $show(res$6));$skip(88); 
  
  
  def concat[T](xs: List[T], ys: List[T]): List[T] =
  	(xs foldRight ys)(_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(42); val res$7 = 
  
  concat(List(1,2,3,4), List(5,6,7,8));System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(97); 
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())(f(_) :: _);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(54); val res$8 = 
    
    
 	mapFun[Int, Int](List(1,2,3), (z => z*z));System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(74); 


	def lengthFun[T](xs: List[T]): Int = (xs foldRight 0)((_, l) => l + 1);System.out.println("""lengthFun: [T](xs: List[T])Int""");$skip(29); val res$9 = 

	lengthFun(List(1,2,3,4,5));System.out.println("""res9: Int = """ + $show(res$9))}

}
