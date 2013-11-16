package week8



object generators {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

trait Generator[+T] {
	self => 						//an alias for "this"
	
	def generate: T
	
	def map[S](f: T => S): Generator[S] = new Generator[S] {
		def generate = f(self.generate)
	}

	def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S] {
		def generate = f(self.generate).generate
	}
}


	val integers = new Generator[Int] {
		def generate = scala.util.Random.nextInt()
	}                                         //> integers  : week8.generators.Generator[Int] = week8.generators$$anonfun$main
                                                  //| $1$$anon$3@5a446cc5

	val booleans = integers.map(_ >= 0)       //> booleans  : week8.generators.Generator[Boolean] = week8.generators$$anonfun$
                                                  //| main$1$Generator$1$$anon$1@5a311ade

	def single[T](x: T): Generator[T] = new Generator[T] {
		def generate = x
	}                                         //> single: [T](x: T)week8.generators.Generator[T]

	def lists: Generator[List[Int]] = for {
		isEmpty <- booleans
		list <- if (isEmpty) emptyLists else nonEmptyLists
	} yield list                              //> lists: => week8.generators.Generator[List[Int]]

	def emptyLists = single(Nil)              //> emptyLists: => week8.generators.Generator[scala.collection.immutable.Nil.typ
                                                  //| e]
	def nonEmptyLists = for {
		head <- integers
		tail <- lists
	} yield head :: tail                      //> nonEmptyLists: => week8.generators.Generator[List[Int]]




	lists.generate                            //> res0: List[Int] = List(228702851, 1718421500)

	lists.generate                            //> res1: List[Int] = List()

	single(8).generate                        //> res2: Int = 8
	single(4).generate                        //> res3: Int = 4


	//type Leaf

/*
	def leafs: Generator[Leaf] = for {
		x <- integers
	} yield Leaf(x)


	def inners: Generator[Inner] = for {
		l <- trees
		r <- trees
	} yield Inner(l,r)


	def trees: Generator[Tree] = for {
		isLeaf <- booleans
		tree <- if (isLeaf) leafs else inners
	} yield tree
}
//import sun.nio.cs.Generator
*/
}