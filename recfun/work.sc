object work {
def sum(x: Int, y: => Int): Int = x               //> sum: (x: Int, y: => Int)Int
def loop(): Int = loop                            //> loop: ()Int

sum(4,loop)                                       //> res0: Int = 4



false || false                                    //> res1: Boolean(false) = false

}