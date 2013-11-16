package week7


object streams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); val res$0 = 

	(1 to 1000).toStream;System.out.println("""res0: scala.collection.immutable.Stream[Int] = """ + $show(res$0));$skip(30); val res$1 = 


	((1000 to 10000).toStream);System.out.println("""res1: scala.collection.immutable.Stream[Int] = """ + $show(res$1));$skip(109); 


	// x #:: xs === Stream(x,xs)


	val c = Vector(Vector('a','b','c'), Vector('d','e','f'), Vector('g','h'));System.out.println("""c  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(c ));$skip(10); val res$2 = 
  c(0)(0);System.out.println("""res2: Char = """ + $show(res$2))}

}
