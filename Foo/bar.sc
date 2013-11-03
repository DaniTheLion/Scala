



object bar {
	type Occurrences = List[(Char, Int)]

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val w = "HelLo World"                     //> w  : String = HelLo World
	w groupBy(c => c)                         //> res0: scala.collection.immutable.Map[Char,String] = Map(e -> e,   -> " ", L 
                                                  //| -> L, l -> ll, H -> H, W -> W, r -> r, o -> oo, d -> d)
	w groupBy(c => c) map(x => (x._1,x._2.length))
                                                  //> res1: scala.collection.immutable.Map[Char,Int] = Map(e -> 1,   -> 1, L -> 1,
                                                  //|  l -> 2, H -> 1, W -> 1, r -> 1, o -> 2, d -> 1)
  //w groupBy(c => c) toList map (x => (x._1, x._2.length))
  
	val l1 = (w groupBy(c => c.toLower) toList) map(x => (x._1, x._2.length))
                                                  //> l1  : List[(Char, Int)] = List((e,1), ( ,1), (l,3), (h,1), (r,1), (w,1), (o,
                                                  //| 2), (d,1))
	
	
	l1.sortBy(_._1)                           //> res2: List[(Char, Int)] = List(( ,1), (d,1), (e,1), (h,1), (l,3), (o,2), (r,
                                                  //| 1), (w,1))
               
  l1 take 0                                       //> res3: List[(Char, Int)] = List()


	val occ = List(('a',2), ('b',2))          //> occ  : List[(Char, Int)] = List((a,2), (b,2))


	val l = for (o <- occ; i <- 1 to o._2) yield o._1
                                                  //> l  : List[Char] = List(a, a, b, b)


  val z = for (i <- 0 to l.length; c <-l.combinations(i)) yield c
                                                  //> z  : scala.collection.immutable.IndexedSeq[List[Char]] = Vector(List(), List
                                                  //| (a), List(b), List(a, a), List(a, b), List(b, b), List(a, a, b), List(a, b, 
                                                  //| b), List(a, a, b, b))
 //	for (x <- z; y<-x) println(y mkString)

	val ll = List('a','b','c')                //> ll  : List[Char] = List(a, b, c)
	ll mkString                               //> res4: String = abc
  //z mkString
	
	
	occ.flatMap(a => for(i <- 1 to a._2) yield a._1).combinations(2).mkString
                                                  //> res5: String = List(a, a)List(a, b)List(b, b)
//	val q = occ.toMap[Char,Int].
//	val q = Map[Char,Int](occ).withDefaultValue(0)
	//occ.combinations(1) //mkString
//	val tt = occ toMap withDefaultValue 0
	
	def wordOccurrences(w: String): List[(Char,Int)] =
    ((w.groupBy(c => c.toLower).toList) map (x => (x._1, x._2.length))).sortBy(_._1)
                                                  //> wordOccurrences: (w: String)List[(Char, Int)]
    
    

  /** Converts a sentence into its character occurrence list. */
  def sentenceOccurrences(s: List[String]): Occurrences = {
		println(wordOccurrences(s.toList.mkString))
		List()
	}                                         //> sentenceOccurrences: (s: List[String])bar.Occurrences
// 		s.flatMap(w => wordOccurrences(w)).groupBy(l => l._1).map(x => (x._1, x._2.length)).toList.sortBy(_._1)

	
	
	wordOccurrences("Roberto")                //> res6: List[(Char, Int)] = List((b,1), (e,1), (o,2), (r,2), (t,1))
	wordOccurrences("Carlos")                 //> res7: List[(Char, Int)] = List((a,1), (c,1), (l,1), (o,1), (r,1), (s,1))
	
	
	List("Roberto", "Carlos").flatMap(w => wordOccurrences(w)).groupBy(l => l._1)
                                                  //> res8: scala.collection.immutable.Map[Char,List[(Char, Int)]] = Map(e -> Lis
                                                  //| t((e,1)), s -> List((s,1)), t -> List((t,1)), a -> List((a,1)), b -> List((
                                                  //| b,1)), l -> List((l,1)), c -> List((c,1)), r -> List((r,2), (r,1)), o -> Li
                                                  //| st((o,2), (o,1)))
	
	sentenceOccurrences(List("Roberto", "Carlos"))
                                                  //> List((a,1), (b,1), (c,1), (e,1), (l,1), (o,3), (r,3), (s,1), (t,1))
                                                  //| res9: bar.Occurrences = List()
	
}