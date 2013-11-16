package quickcheck

import common._

import org.scalacheck._
import Arbitrary._
import Gen._
import Prop._

abstract class QuickCheckHeap extends Properties("Heap") with IntHeap {

  property("min1") = forAll { a: Int =>
    val h = insert(a, empty)
    findMin(h) == a
  }

  lazy val genHeap: Gen[H] = for {
	  v <- arbitrary[A]
	  k <- arbitrary[A]
	  h1 <- oneOf(empty, insert(k,empty), genHeap)
	  h2 <- oneOf(empty, insert(k,empty), genHeap)
  } yield meld(h1,h2)

  
  
  property("gen1") = forAll { (h: H) =>
    val m = if (isEmpty(h)) 0 else findMin(h)
  	findMin(insert(m, h)) == m
  }
  

  property("min2") = forAll { a: Int =>
    forAll{ b: Int =>
	  	val h = insert(b,insert(a,empty))
	    val m = if (a < b) a else b
	  	findMin(h) == m
    }
  }
  
  property("inserting and then removing element gives an empty heap") = forAll { a: Int =>
  	val h = insert(a,empty)
  	deleteMin(h) == empty
  }

  property("sorted sequence of elements when continually finding and deleting minima") = 
    forAll { h: H =>
  		def minima(hs: H, s: List[Int]): List[Int] = if (isEmpty(hs)) s else minima(deleteMin(hs), s :+ findMin(hs))
  		val l = minima(h, List())
  		l == minima(h, List()).sorted
  	}

//  
//    property("sorted sequence of elements when continually finding and deleting minima") = 
//    { 
//  		def minima(h: H, s: List[Int]): List[Int] = if (isEmpty(h)) s else minima(deleteMin(h), s :+ findMin(h))
//  		val h = insert(1,insert(-2,insert(3,empty)))
//  		List(-2,1,3) == minima(h,List())
//  	}
  
  
  property("Finding a minimum of the melding of any two heaps should return a minimum of one or the other") = 
    forAll { (h1: H, h2: H) =>   
      if (isEmpty(meld(h1,h2)))
        true
      else {
   		Set(h1,h2).filter(!isEmpty(_)).map(findMin(_)) contains findMin(meld(h1, h2))
      }
  	}

  
//  
//  property("Finding a minimum of the melding of any two heaps should return a minimum of one or the other") = 
//	  forAll { (a: Int, b: Int) =>
//	    val m = math.min(a, b)
//	    
//	    findMin(meld(insert(a,empty), insert(b,empty))) == m
//    
//	  }
//  
  /*
*/
  implicit lazy val arbHeap: Arbitrary[H] = Arbitrary(genHeap)

}
