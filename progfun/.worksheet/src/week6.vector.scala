package week6


object vector {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
	//SEQ includes vector, list, range
	//Vector complexity:
	//Adding an element - LOG_32(N)

	val nums = Vector(1,55,3,4);System.out.println("""nums  : scala.collection.immutable.Vector[Int] = """ + $show(nums ));$skip(13); val res$0 = 
	nums :+ 100;System.out.println("""res0: scala.collection.immutable.Vector[Int] = """ + $show(res$0));$skip(28); 


	val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(21); val res$1 = 
	
	xs map (x => x*2);System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(27); 
	
	
	val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(26); val res$2 = 
	s filter(c => c.isLower);System.out.println("""res2: String = """ + $show(res$2));$skip(27); 

	val r: Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(23); 
	val t: Range = 1 to 5;System.out.println("""t  : Range = """ + $show(t ));$skip(16); val res$3 = 
	
	1 to 10 by 3;System.out.println("""res3: scala.collection.immutable.Range = """ + $show(res$3));$skip(14); val res$4 = 
	6 to 0 by -2;System.out.println("""res4: scala.collection.immutable.Range = """ + $show(res$4));$skip(28); val res$5 = 

	s exists (c => c.isUpper);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(27); val res$6 = 
	s forall (c => c.isUpper);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(33); 
	
	val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(13); val res$7 = 
	pairs unzip;System.out.println("""res7: (List[Int], List[Char]) = """ + $show(res$7));$skip(126); val res$8 = 
	
	
	//Applies collection-valued function f to all elements of xs and concatenates the results:
	s flatMap (c => List('.',c));System.out.println("""res8: String = """ + $show(res$8));$skip(10); val res$9 = 
	
	xs.sum;System.out.println("""res9: Int = """ + $show(res$9));$skip(8); val res$10 = 
	xs.max;System.out.println("""res10: Int = """ + $show(res$10));$skip(14); 
	
	val M = 10;System.out.println("""M  : Int = """ + $show(M ));$skip(11); 
	val N = 5;System.out.println("""N  : Int = """ + $show(N ));$skip(73); val res$11 = 
	
	//All combinations
	(1 to M) flatMap (x => (1 to N) map (y => (x,y)));System.out.println("""res11: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$11));$skip(112); 
	def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
		(xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(51); val res$12 = 
	
	scalarProduct(Vector(1,0,1,0), Vector(1,0,1,0));System.out.println("""res12: Double = """ + $show(res$12));$skip(154); 
	
//	def isPrime(n: Int): Boolean = (2 until n).filter(x => n % x == 0).length == 0
	
	def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d !=0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(16); val res$13 = 
		
	isPrime(29);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(13); 

	val n = 21;System.out.println("""n  : Int = """ + $show(n ))}
	
}
