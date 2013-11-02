object listFun {
  5+5                                             //> res0: Int(10) = 10
	val x = 1 :: 2 :: 3 :: Nil                //> x  : List[Int] = List(1, 2, 3)
	val y = 4 :: 5 :: 6 :: Nil                //> y  : List[Int] = List(4, 5, 6)
	val z = x ::: y                           //> z  : List[Int] = List(1, 2, 3, 4, 5, 6)
	
	x.tail                                    //> res1: List[Int] = List(2, 3)
	
	val xx = List(('c',1), ('x', 500))        //> xx  : List[(Char, Int)] = List((c,1), (x,500))
	
	xx.sortBy(_._2)                           //> res2: List[(Char, Int)] = List((c,1), (x,500))
	
	val l = List(('a', List()),('c', List()),('f', List()),('h', List()),('y', List()))
                                                  //> l  : List[(Char, List[Nothing])] = List((a,List()), (c,List()), (f,List()), 
                                                  //| (h,List()), (y,List()))
	l.tail                                    //> res3: List[(Char, List[Nothing])] = List((c,List()), (f,List()), (h,List()),
                                                  //|  (y,List()))

l.find(p => p._1 == 'a')                          //> res4: Option[(Char, List[Nothing])] = Some((a,List()))
	xx match {
		case List() => 4
	}                                         //> scala.MatchError: List((c,1), (x,500)) (of class scala.collection.immutable.
                                                  //| $colon$colon)
                                                  //| 	at listFun$$anonfun$main$1.apply$mcV$sp(listFun.scala:17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at listFun$.main(listFun.scala:1)
                                                  //| 	at listFun.main(listFun.scala)
	
//  println(List(1,2,3)::Cons)
}