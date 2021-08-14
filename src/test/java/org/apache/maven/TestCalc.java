package org.apache.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.apache.maven.Calc;
/**
 * Unit test for simple App.
 */
public class TestCalc {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void TestAdd() {


        assertEquals(2,Calc.add(1, 1));
    }
    @Test
    public void TestSub() {


        assertEquals(1,Calc.subtract(2, 1));
    }
}

