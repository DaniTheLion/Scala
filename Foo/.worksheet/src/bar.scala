



object bar {
	type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 

  println("Welcome to the Scala worksheet");$skip(23); 
	val w = "HelLo World";System.out.println("""w  : String = """ + $show(w ));$skip(19); val res$0 = 
	w groupBy(c => c);System.out.println("""res0: scala.collection.immutable.Map[Char,String] = """ + $show(res$0));$skip(48); val res$1 = 
	w groupBy(c => c) map(x => (x._1,x._2.length));System.out.println("""res1: scala.collection.immutable.Map[Char,Int] = """ + $show(res$1));$skip(138); 
  //w groupBy(c => c) toList map (x => (x._1, x._2.length))
  
	val l1 = (w groupBy(c => c.toLower) toList) map(x => (x._1, x._2.length));System.out.println("""l1  : List[(Char, Int)] = """ + $show(l1 ));$skip(21); val res$2 = 
	
	
	l1.sortBy(_._1);System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2));$skip(28); val res$3 = 
               
  l1 take 0;System.out.println("""res3: List[(Char, Int)] = """ + $show(res$3));$skip(36); 


	val occ = List(('a',2), ('b',2));System.out.println("""occ  : List[(Char, Int)] = """ + $show(occ ));$skip(53); 


	val l = for (o <- occ; i <- 1 to o._2) yield o._1;System.out.println("""l  : List[Char] = """ + $show(l ));$skip(68); 


  val z = for (i <- 0 to l.length; c <-l.combinations(i)) yield c;System.out.println("""z  : scala.collection.immutable.IndexedSeq[List[Char]] = """ + $show(z ));$skip(72); 
 //	for (x <- z; y<-x) println(y mkString)

	val ll = List('a','b','c');System.out.println("""ll  : List[Char] = """ + $show(ll ));$skip(13); val res$4 = 
	ll mkString;System.out.println("""res4: String = """ + $show(res$4));$skip(94); val res$5 = 
  //z mkString
	
	
	occ.flatMap(a => for(i <- 1 to a._2) yield a._1).combinations(2).mkString;System.out.println("""res5: String = """ + $show(res$5));$skip(296); 
//	val q = occ.toMap[Char,Int].
//	val q = Map[Char,Int](occ).withDefaultValue(0)
	//occ.combinations(1) //mkString
//	val tt = occ toMap withDefaultValue 0
	
	def wordOccurrences(w: String): List[(Char,Int)] =
    ((w.groupBy(c => c.toLower).toList) map (x => (x._1, x._2.length))).sortBy(_._1);System.out.println("""wordOccurrences: (w: String)List[(Char, Int)]""");$skip(194); 
    
    

  /** Converts a sentence into its character occurrence list. */
  def sentenceOccurrences(s: List[String]): Occurrences = {
		println(wordOccurrences(s.toList.mkString))
		List()
	};System.out.println("""sentenceOccurrences: (s: List[String])bar.Occurrences""");$skip(142); val res$6 = 
// 		s.flatMap(w => wordOccurrences(w)).groupBy(l => l._1).map(x => (x._1, x._2.length)).toList.sortBy(_._1)

	
	
	wordOccurrences("Roberto");System.out.println("""res6: List[(Char, Int)] = """ + $show(res$6));$skip(27); val res$7 = 
	wordOccurrences("Carlos");System.out.println("""res7: List[(Char, Int)] = """ + $show(res$7));$skip(83); val res$8 = 
	
	
	List("Roberto", "Carlos").flatMap(w => wordOccurrences(w)).groupBy(l => l._1);System.out.println("""res8: scala.collection.immutable.Map[Char,List[(Char, Int)]] = """ + $show(res$8));$skip(50); val res$9 = 
	
	sentenceOccurrences(List("Roberto", "Carlos"));System.out.println("""res9: bar.Occurrences = """ + $show(res$9))}
	
}
