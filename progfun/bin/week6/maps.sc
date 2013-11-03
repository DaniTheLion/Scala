package week6

object maps {
  val romanLiterals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanLiterals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
  val capitals = Map("US" -> "Washington", "Israel" -> "Jerusalem")
                                                  //> capitals  : scala.collection.immutable.Map[String,String] = Map(US -> Washin
                                                  //| gton, Israel -> Jerusalem)
                                               
 capitals get "US"                                //> res0: Option[String] = Some(Washington)
 capitals get "foo"                               //> res1: Option[String] = None



	def showCapital(country: String) = capitals.get(country) match {
		case Some(capital) => capital
		case None => "NO SUCH DATA"
	}                                         //> showCapital: (country: String)String


	showCapital("US")                         //> res2: String = Washington
	showCapital("Denmark")                    //> res3: String = NO SUCH DATA

}