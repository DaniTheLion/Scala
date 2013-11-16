package week8



object generators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet")

trait Generator[+T] {
	self => 						//an alias for "this"
	
	def generate: T
	
	def map[S](f: T => S): Generator[S] = new Generator[S] {
		def generate = f(self.generate)
	}

	def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S] {
		def generate = f(self.generate).generate
	}
};$skip(385); 


	val integers = new Generator[Int] {
		def generate = scala.util.Random.nextInt()
	};System.out.println("""integers  : week8.generators.Generator[Int] = """ + $show(integers ));$skip(38); 

	val booleans = integers.map(_ >= 0);System.out.println("""booleans  : week8.generators.Generator[Boolean] = """ + $show(booleans ));$skip(79); 

	def single[T](x: T): Generator[T] = new Generator[T] {
		def generate = x
	};System.out.println("""single: [T](x: T)week8.generators.Generator[T]""");$skip(131); 

	def lists: Generator[List[Int]] = for {
		isEmpty <- booleans
		list <- if (isEmpty) emptyLists else nonEmptyLists
	} yield list;System.out.println("""lists: => week8.generators.Generator[List[Int]]""");$skip(31); 

	def emptyLists = single(Nil);System.out.println("""emptyLists: => week8.generators.Generator[scala.collection.immutable.Nil.type]""");$skip(84); 
	def nonEmptyLists = for {
		head <- integers
		tail <- lists
	} yield head :: tail;System.out.println("""nonEmptyLists: => week8.generators.Generator[List[Int]]""");$skip(20); val res$0 = 




	lists.generate;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(17); val res$1 = 

	lists.generate;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(21); val res$2 = 

	single(8).generate;System.out.println("""res2: Int = """ + $show(res$2));$skip(20); val res$3 = 
	single(4).generate;System.out.println("""res3: Int = """ + $show(res$3))}


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
