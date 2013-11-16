package week8



object generators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(86); 

	val integers = new Generator[Int] {
		def generate = scala.util.Random.nextInt()
	};System.out.println("""integers  : AnyRef{def generate: Int} = """ + $show(integers ));$skip(38); 

	val booleans = integers.map(_ >= 0);System.out.println("""booleans  : <error> = """ + $show(booleans ));$skip(71); 


	def leafs: Generator[Leaf] = for {
		x <- integers
	} yield Leaf(x);System.out.println("""leafs: => <error>""");$skip(86); 


	def inners: Generator[Inner] = for {
		l <- trees
		r <- trees
	} yield Inner(l,r);System.out.println("""inners: => <error>""");$skip(113); 


	def trees: Generator[Tree] = for {
		isLeaf <- booleans
		tree <- if (isLeaf) leafs else inners
	} yield tree;System.out.println("""trees: => <error>""")}
}
import sun.nio.cs.Generator
