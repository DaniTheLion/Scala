package funsets
import FunSets._

object set_test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
	val x = 3;System.out.println("""x  : Int = """ + $show(x ));$skip(27); 
  val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(26); 
	val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(26); val res$0 = 
	contains(union(s1,s2),3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(15); 
	
	println(s2)}
}
