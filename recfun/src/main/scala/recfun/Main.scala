package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def helper(chars: List[Char], n: Int): Boolean =
      if (chars.isEmpty) n == 0
      else {
        val head = chars.head
        if (head == '(') helper(chars.tail, n + 1)
        else if (head == ')' && n == 0) false
        else if (head == ')' && n > 0) helper(chars.tail, n - 1)
        else helper(chars.tail, n)
      }
      helper(chars, 0)
  }                        
  
  
  
  
  
  /**
   * Exercise 3
   */
def countChange(money: Int, coins: List[Int]): Int = 
	if (money == 0) 1
	else if(coins.isEmpty) 0
	else{	  
		val current_coin = coins.head
		if (money - current_coin < 0) countChange(money, coins.tail)
		else (countChange(money - current_coin, coins)) + countChange(money, coins.tail)
	}
}
