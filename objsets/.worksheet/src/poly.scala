object poly {
	
trait List[T] {
		def isEmpty: Boolean
		def head: T
		def tail: List[T]
	}


class Cons(val head: T, val tail: List[T]) extends List[T] {

}
}
