package simulations

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CircuitSuite extends CircuitSimulator with FunSuite {
  val InverterDelay = 1
  val AndGateDelay = 3
  val OrGateDelay = 5
  
  test("andGate example") {
    val in1, in2, out = new Wire
    andGate(in1, in2, out)
    in1.setSignal(false)
    in2.setSignal(false)
    run
    
    assert(out.getSignal === false, "and 1")

    in1.setSignal(true)
    run
    
    assert(out.getSignal === false, "and 2")

    in2.setSignal(true)
    run
    
    assert(out.getSignal === true, "and 3")
  }

  
  
  
   test("demux2Way") {
    val in = new Wire
    val c0 = new Wire
    val out0 = new Wire
    val out1 = new Wire
    demux(in, List(c0), List(out1, out0))

    c0.setSignal(false)
    in.setSignal(false)
    run
    
    assert(out0.getSignal === false, "demux1 1")
    assert(out1.getSignal === false, "demux1 2")

    in.setSignal(true)
    run
    
    assert(out0.getSignal === true, "demux1 3")
    assert(out1.getSignal === false, "demux1 4")

    c0.setSignal(true)
    run
    assert(out0.getSignal === false, "demux1 5")
    assert(out1.getSignal === true, "demux1 6")  
  }

   
   test("demux4Way") {
    val in = new Wire
    val c0, c1  = new Wire
    val out0, out1, out2, out3 = new Wire
    demux(in, List(c1, c0), List(out3, out2, out1, out0))

    c0.setSignal(false)
    in.setSignal(false)
    run
    
    assert(out0.getSignal === false, "demux4Way 1")
    assert(out1.getSignal === false, "demux4Way 2")
    assert(out2.getSignal === false, "demux4Way 3")
    assert(out3.getSignal === false, "demux4Way 4")


    c1.setSignal(false)
    c0.setSignal(false)
    in.setSignal(true)
    run
    
    assert(out0.getSignal === true, "demux4Way 5")
    assert(out1.getSignal === false, "demux4Way 6")
    assert(out2.getSignal === false, "demux4Way 7")
    assert(out3.getSignal === false, "demux4Way 8")

    
    c1.setSignal(false)
    c0.setSignal(true)
    in.setSignal(true)
    run
    
    assert(out0.getSignal === false, "demux4Way 9")
    assert(out1.getSignal === true, "demux4Way 10")
    assert(out2.getSignal === false, "demux4Way 11")
    assert(out3.getSignal === false, "demux4Way 12")

        
    c1.setSignal(true)
    c0.setSignal(false)
    in.setSignal(true)
    run
    
    assert(out0.getSignal === false, "demux4Way 13")
    assert(out1.getSignal === false, "demux4Way 14")
    assert(out2.getSignal === true, "demux4Way 15")
    assert(out3.getSignal === false, "demux4Way 16")
    
    
    c1.setSignal(true)
    c0.setSignal(true)
    in.setSignal(true)
    run
    
    assert(out0.getSignal === false, "demux4Way 17")
    assert(out1.getSignal === false, "demux4Way 18")
    assert(out2.getSignal === false, "demux4Way 19")
    assert(out3.getSignal === true, "demux4Way 20")
    
    
    
    
    
    //    
//    
//    
//    in.setSignal(true)
//    run
//    
//    assert(out0.getSignal === true, "demux1 3")
//    assert(out1.getSignal === false, "demux1 4")
//
//    c0.setSignal(true)
//    run
//    assert(out0.getSignal === false, "demux1 5")
//    assert(out1.getSignal === true, "demux1 6")  
  }

   
   
  //
  // to complete with tests for orGate, demux, ...
  //

}
