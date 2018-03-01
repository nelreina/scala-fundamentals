package tuts;

import org.scalatest.FlatSpec;

class Calculator extends FlatSpec {
    "Calculation of 1 + 1 " should 
    "return a number with value 2" in {
        val m = new Main();
        assert(m.add(1,1) == 2)
    }
    "Calculation of 2 - 1 " should 
    "return a number with value 1" in {
        val m = new Main();
        assert(m.remove(2,1) == 1)
    }
}