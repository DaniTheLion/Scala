object lect_2_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); 
  val x = new Rational(1,3);System.out.println("""x  : Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : Rational = """ + $show(z ));$skip(15); val res$0 = 
  
  x - y - z;System.out.println("""res0: Rational = """ + $show(res$0));$skip(11); val res$1 = 
  
  x + y;System.out.println("""res1: Rational = """ + $show(res$1));$skip(5); val res$2 = 
  -x;System.out.println("""res2: Rational = """ + $show(res$2));$skip(8); val res$3 = 
  x - y;System.out.println("""res3: Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: Rational = """ + $show(res$4));$skip(11); val res$5 = 
  
  x < y;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(10); val res$6 = 
  x max y;System.out.println("""res6: Rational = """ + $show(res$6));$skip(29); val res$7 = 
  
  new Rational(1,2).numer;System.out.println("""res7: Int = """ + $show(res$7))}
  
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
