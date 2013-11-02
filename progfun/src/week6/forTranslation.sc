package week6

object forTranslation {
//	def foo(books: List[String], authors: List[String]): IndexedSeq[String] =
 //  for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title


	//I
//	books.flatMap(b => for (a <- b.books if a startsWith "Bird") yield b.title)

	//II
//	books.flatMap(b => for (a <- b.authors.withFilter(a => a startsWith "Bird")) yield b.title)
	
	//III
	//books.flatMap( b => b.authors.withFilter(a => a startsWith "Bird")).map(y => y.title))


5 + 5                                             //> res0: Int(10) = 10

}