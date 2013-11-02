package week5

object high_functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(160); 
  def squareList(xs: List[Int]): List[Int] = xs match {
  	case Nil => Nil
  	case y :: ys => y * y :: squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(38); val res$0 = 
  
  
  squareList(List(1,2,3,4,5,6));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(72); 
  
  
  
	def squareList2(xs: List[Int]): List[Int] = xs map (x => x*x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(37); val res$1 = 
  
  squareList2(List(4,5,67,8,545));System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(37); 


	val l = List(45,-65,24,-5,6,-9,1);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(24); val res$2 = 


	l.filter(x => x > 0);System.out.println("""res2: List[Int] = """ + $show(res$2))}
}
