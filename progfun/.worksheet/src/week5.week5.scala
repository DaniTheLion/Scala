package week5

object week5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  val fruit = List("apples", "oranges", "pears");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(27); 
  val nums = List(1, 2, 3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(73); 

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt: (n: Int, xs: List[Int])List[Int]""");$skip(20); val res$0 = 

	removeAt(1, nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(215); 


	def flatten(xs: List[Any]): List[Any] = xs match {
			case List() => List()
			case (List() :: zs) => flatten(zs)
			case ((y::ys)::zs) => flatten(y::ys) ::: flatten(zs)
			case y :: ys => y :: flatten(ys)
			
};System.out.println("""flatten: (xs: List[Any])List[Any]""");$skip(27); val res$1 = 

	flatten(List(List(100)));System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(52); val res$2 = 

	flatten(List(List(1, 1), 2, List(3, List(5, 8))));System.out.println("""res2: List[Any] = """ + $show(res$2))}
																		 //             >   res0: List[Any] = List(1, 1, 2, 3, 5, 8)

}
