object listFun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(22); val res$0 = 
  5+5;System.out.println("""res0: Int(10) = """ + $show(res$0));$skip(28); 
	val x = 1 :: 2 :: 3 :: Nil;System.out.println("""x  : List[Int] = """ + $show(x ));$skip(28); 
	val y = 4 :: 5 :: 6 :: Nil;System.out.println("""y  : List[Int] = """ + $show(y ));$skip(17); 
	val z = x ::: y;System.out.println("""z  : List[Int] = """ + $show(z ));$skip(10); val res$1 = 
	
	x.tail;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(38); 
	
	val xx = List(('c',1), ('x', 500));System.out.println("""xx  : List[(Char, Int)] = """ + $show(xx ));$skip(19); val res$2 = 
	
	xx.sortBy(_._2);System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2));$skip(87); 
	
	val l = List(('a', List()),('c', List()),('f', List()),('h', List()),('y', List()));System.out.println("""l  : List[(Char, List[Nothing])] = """ + $show(l ));$skip(8); val res$3 = 
	l.tail;System.out.println("""res3: List[(Char, List[Nothing])] = """ + $show(res$3));$skip(26); val res$4 = 

l.find(p => p._1 == 'a');System.out.println("""res4: Option[(Char, List[Nothing])] = """ + $show(res$4));$skip(34); val res$5 = 
	xx match {
		case List() => 4
	};System.out.println("""res5: Int = """ + $show(res$5))}
	
//  println(List(1,2,3)::Cons)
}
