object week_2 {
  (x: Int) => x + x                               //> res0: Int => Int = <function1>
  def cube = (x: Int) => x * x * x                //> cube: => Int => Int





  def sum1(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum1(f, a + 1, b)                 //> sum1: (f: Int => Int, a: Int, b: Int)Int


  def sum2(f: Int => Int,a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
  }                                               //> sum2: (f: Int => Int, a: Int, b: Int)Int
	
	
	def sum3(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a>b) 0
			else f(a) + sumF(a+1,b)
		sumF
	}                                         //> sum3: (f: Int => Int)(Int, Int) => Int
	
	
	
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f)(a + 1,b)
                                                  //> sum: (f: Int => Int)(a: Int, b: Int)Int
	
	
	
	
	
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1 else f(a)*product(f)(a+1, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
	
	
	
	product(x => x*x)(3,4)                    //> res1: Int = 144
	
	
	
	def fact(n: Int) = product(x => x)(1,n)   //> fact: (n: Int)Int
	
	
	fact(5)                                   //> res2: Int = 120
	
	
	
	def mapReduce(combine_f: (Int, Int) => Int, unit: Int)(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) unit else combine_f(f(a), mapReduce(combine_f, unit)(f)(a+1, b) )
                                                  //> mapReduce: (combine_f: (Int, Int) => Int, unit: Int)(f: Int => Int)(a: Int, 
                                                  //| b: Int)Int
	
	mapReduce((x,y) => x + y, 0)(x => x*x)(1,10)
                                                  //> res3: Int = 385
}