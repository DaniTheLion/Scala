package week6


object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
	def isPrime(n: Int): Boolean = (2 until n) forall (d => n%d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(13); 
	
	val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(112); val res$0 = 
	
		(1 until n) flatMap (i =>
			(1 until i) map (j => (i,j))) filter (pair =>
					isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(126); val res$1 = 
                                       
    for {
    	i <- 1 until n
			j <- 1 until i
			if isPrime(i + j)
		} yield (i, j);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(129); 
    
  
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for {
				(x,y) <- xs zip ys
    } yield x*y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(43); val res$2 = 


	scalarProduct(List(1,2,3), List(0,2,1));System.out.println("""res2: Double = """ + $show(res$2))}
}
