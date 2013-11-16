package week2

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet")
	
	object sim extends Circuits with Parameters
	import sim._;$skip(100); 
	
	val in1, in2, sum, carry = new Wire;System.out.println("""in1  : week2.test.sim.Wire = """ + $show(in1 ));System.out.println("""in2  : week2.test.sim.Wire = """ + $show(in2 ));System.out.println("""sum  : week2.test.sim.Wire = """ + $show(sum ));System.out.println("""carry  : week2.test.sim.Wire = """ + $show(carry ));$skip(34); 
  halfAdder(in1, in2, sum, carry);$skip(20); 
  probe("sum", sum);$skip(24); 
  probe("carry", carry);$skip(22); 


	in1 setSignal true;$skip(7); 
	run();$skip(21); 
	in2 setSignal(true);$skip(5); 
	run;$skip(22); 
  in1 setSignal false;$skip(6); 
  run}
}
