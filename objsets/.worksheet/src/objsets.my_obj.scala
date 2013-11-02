package objsets
//import

object my_obj {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(53); 
  val set2 = set1.incl(new Tweet("a", "a body", 20));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(59); 
  
  
  val set3 = set2.incl(new Tweet("b", "b body", 20));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(38); 
  set3.foreach(elem => println(elem));$skip(57); val res$0 = 
  
  set3.filterAcc(elem => elem.user == 'a', new Empty);System.out.println("""res0: objsets.TweetSet = """ + $show(res$0));$skip(49); val res$1 = 
  
  
  set3.incl(new Tweet ("c", "c body", 30));System.out.println("""res1: objsets.TweetSet = """ + $show(res$1));$skip(39); 
 
 set3.foreach(elem => println(elem));$skip(57); 
  
  val l = new Cons(new Tweet("a", "a body", 20), Nil);System.out.println("""l  : objsets.Cons = """ + $show(l ))}
}
