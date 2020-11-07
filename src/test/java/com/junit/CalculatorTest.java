package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void addTest(){
        int addResult01 = Calculator.add(4, 5);
        int addResult02 = Calculator.add(4, 5);
        int addResult03 = Calculator.add(6, 4);
        assertAll(
                ()->assertEquals(9,addResult01),
                ()->assertEquals(7,addResult02),
                ()->assertEquals(10,addResult03)
        );
    }

    @Test
    void subTest(){
        int subResult = Calculator.sub(6, 5);
        assertEquals(1,subResult);
    }

    @Test
    void multiplyTest(){
        int multiplyResult = Calculator.multiply(4, 5);
        assertEquals(20,multiplyResult);
    }

    @Test
    void divideTest(){
        int divideResult = Calculator.divide(8, 2);
        assertEquals(4,divideResult);
    }

    @Test
    void accumulatorTest() throws InterruptedException {
        Calculator.accumulator( 4);
        Calculator.accumulator( 4);
        int accumulateResult = Calculator.accumulator( 4);
        assertEquals(21,accumulateResult);
    }
}
