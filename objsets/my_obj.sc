package objsets
//import

object my_obj {
  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@56dfbc0d
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@21b5c5b3
  
  
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@9695ed7
  set3.foreach(elem => println(elem))             //> User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
  
  set3.filterAcc(elem => elem.user == 'a', new Empty)
                                                  //> res0: objsets.TweetSet = objsets.Empty@35b4e829
  
  
  set3.incl(new Tweet ("c", "c body", 30))        //> res1: objsets.TweetSet = objsets.NonEmpty@77f5f74a
 
 set3.foreach(elem => println(elem))              //> User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
  
  val l = new Cons(new Tweet("a", "a body", 20), Nil)
                                                  //> l  : objsets.Cons = objsets.Cons@768179c2
}