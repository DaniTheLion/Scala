object work {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 
def sum(x: Int, y: => Int): Int = x;System.out.println("""sum: (x: Int, y: => Int)Int""");$skip(23); 
def loop(): Int = loop;System.out.println("""loop: ()Int""");$skip(13); val res$0 = 

sum(4,loop);System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 



false || false;System.out.println("""res1: Boolean(false) = """ + $show(res$1))}

}
