package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator =  new Calculator();

        assertEquals(2, calculator.add(1, 1));
        assertEquals(-1, calculator.add(0, -1));
    }

    @Test
    public void subtract() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(3, calculator.subtract(7, 4));
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.divide(24,4));
    }

    @Test
    public void multiply() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(18, calculator.multiply(6,3));
    }

}