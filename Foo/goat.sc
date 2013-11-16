object goat {


	abstract class ANIMAL
	case class DOG(n: Int) extends ANIMAL
	case class CAT(n: Int) extends ANIMAL



	5+5                                       //> res0: Int(10) = 10
	new DOG(21)                               //> res1: goat.DOG = DOG(21)

}