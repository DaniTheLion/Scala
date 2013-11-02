object week_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(35); val res$0 = 
  (x: Int) => x + x;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(35); 
  def cube = (x: Int) => x * x * x;System.out.println("""cube: => Int => Int""");$skip(105); 





  def sum1(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum1(f, a + 1, b);System.out.println("""sum1: (f: Int => Int, a: Int, b: Int)Int""");$skip(171); 


  def sum2(f: Int => Int,a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
  };System.out.println("""sum2: (f: Int => Int, a: Int, b: Int)Int""");$skip(137); 
	
	
	def sum3(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a>b) 0
			else f(a) + sumF(a+1,b)
		sumF
	};System.out.println("""sum3: (f: Int => Int)(Int, Int) => Int""");$skip(96); 
	
	
	
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f)(a + 1,b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(107); 
	
	
	
	
	
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1 else f(a)*product(f)(a+1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(30); val res$1 = 
	
	
	
	product(x => x*x)(3,4);System.out.println("""res1: Int = """ + $show(res$1));$skip(47); 
	
	
	
	def fact(n: Int) = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(13); val res$2 = 
	
	
	fact(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(179); 
	
	
	
	def mapReduce(combine_f: (Int, Int) => Int, unit: Int)(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) unit else combine_f(f(a), mapReduce(combine_f, unit)(f)(a+1, b) );System.out.println("""mapReduce: (combine_f: (Int, Int) => Int, unit: Int)(f: Int => Int)(a: Int, b: Int)Int""");$skip(48); val res$3 = 
	
	mapReduce((x,y) => x + y, 0)(x => x*x)(1,10);System.out.println("""res3: Int = """ + $show(res$3))}
}
