

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(66); 

	val f: PartialFunction[String,String] = {case "ping" => "pong"};System.out.println("""f  : PartialFunction[String,String] = """ + $show(f ));$skip(15); val res$0 = 

	 
	f("ping");System.out.println("""res0: String = """ + $show(res$0));$skip(23); val res$1 = 
	f.isDefinedAt("ping");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(22); val res$2 = 
	f.isDefinedAt("abc");System.out.println("""res2: Boolean = """ + $show(res$2));$skip(13); 


	val N = 5;System.out.println("""N  : Int = """ + $show(N ));$skip(78); 
	
	val m = for {
		x <- 2 to N
		y <- 2 to x
		if (x % y == 0)
	} yield (x,y);System.out.println("""m  : scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(m ))}

}
