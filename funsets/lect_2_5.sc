object lect_2_5 {
  val x = new Rational(1,3)                       //> x  : Rational = 1/3
  val y = new Rational(5,7)                       //> y  : Rational = 5/7
  val z = new Rational(3,2)                       //> z  : Rational = 3/2
  
  x - y - z                                       //> res0: Rational = -79/42
  
  x + y                                           //> res1: Rational = 22/21
  -x                                              //> res2: Rational = 1/-3
  x - y                                           //> res3: Rational = 8/-21
  y + y                                           //> res4: Rational = 10/7
  
  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: Rational = 5/7
  
  new Rational(1,2).numer                         //> res7: Int = 1
  
}



class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be non-zero")
	
//	//second constructor
	def this(x: Int) = this(x,1)



	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	val numer = x
	val denom = y
	
	def < (that: Rational) = this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) = if (this < that ) that else this
	
	def unary_- : Rational = new Rational(-numer, denom)
	
	def - (that: Rational) = this + -that
	

	
	
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
			
	override def toString = {
		val g = gcd(numer, denom)
		numer/g + "/" + denom/g
	}
}