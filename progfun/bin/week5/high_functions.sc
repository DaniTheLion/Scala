package week5

object high_functions {
  def squareList(xs: List[Int]): List[Int] = xs match {
  	case Nil => Nil
  	case y :: ys => y * y :: squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]
  
  
  squareList(List(1,2,3,4,5,6))                   //> res0: List[Int] = List(1, 4, 9, 16, 25, 36)
  
  
  
	def squareList2(xs: List[Int]): List[Int] = xs map (x => x*x)
                                                  //> squareList2: (xs: List[Int])List[Int]
  
  squareList2(List(4,5,67,8,545))                 //> res1: List[Int] = List(16, 25, 4489, 64, 297025)


	val l = List(45,-65,24,-5,6,-9,1)         //> l  : List[Int] = List(45, -65, 24, -5, 6, -9, 1)


	l.filter(x => x > 0)                      //> res2: List[Int] = List(45, 24, 6, 1)
}