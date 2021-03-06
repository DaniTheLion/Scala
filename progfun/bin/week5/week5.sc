package week5

object week5 {
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums = List(1, 2, 3)                        //> nums  : List[Int] = List(1, 2, 3)

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt: (n: Int, xs: List[Int])List[Int]

	removeAt(1, nums)                         //> res0: List[Int] = List(1, 3)


	def flatten(xs: List[Any]): List[Any] = xs match {
			case List() => List()
			case (List() :: zs) => flatten(zs)
			case ((y::ys)::zs) => flatten(y::ys) ::: flatten(zs)
			case y :: ys => y :: flatten(ys)
			
}                                                 //> flatten: (xs: List[Any])List[Any]

	flatten(List(List(100)))                  //> res1: List[Any] = List(100)

	flatten(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> res2: List[Any] = List(1, 1, 2, 3, 5, 8)
																		 //             >   res0: List[Any] = List(1, 1, 2, 3, 5, 8)

}