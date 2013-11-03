package week7


object streams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); val res$0 = 

	(1 to 1000).toStream;System.out.println("""res0: scala.collection.immutable.Stream[Int] = """ + $show(res$0));$skip(30); val res$1 = 


	((1000 to 10000).toStream);System.out.println("""res1: scala.collection.immutable.Stream[Int] = """ + $show(res$1))}



}
