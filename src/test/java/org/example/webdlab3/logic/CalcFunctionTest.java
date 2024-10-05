package org.example.webdlab3.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcFunctionTest {
    double start = 0.8;
    double end = 2;
    double step = 0.005;
    private static final double a = 1.5;
    public static double eps = 1e-6;
    CalcFunction calcFunction = new CalcFunction(start,end,step);

    @Test
    public void Test1(){
        double x = 0.8;
        double y = Math.PI*x*x-7/(x*x);
        double f = calcFunction.function(x);
        Assertions.assertEquals(f,y);
    }

    @Test
    public void Test2(){
        double x = 1.7;
        double y = a*x*x*x+7*Math.sqrt(x);
        double f = calcFunction.function(x);
        Assertions.assertEquals(f,y);
    }

    @Test
    public void Test3(){
        double x = 2;
        double y = Math.log10(x+7*Math.sqrt(x));
        double f = calcFunction.function(x);
        Assertions.assertEquals(f,y);
    }

    @Test
    public void countStepTest(){
        Assertions.assertEquals(9,calcFunction.countStep(1,5,0.5));
    }

    @Test
    public void countStepTest1(){
        Assertions.assertEquals(241,calcFunction.countStep(start,end,step));
    }

    @Test
    public void calcFunctionTest(){
        calcFunction.calculate(start,end,step);
    }

    @Test
    public void testArrayX() {
        calcFunction.calculate(start, end, step);
        Assertions.assertEquals(0.8, calcFunction.getX(0),eps);
        Assertions.assertEquals(1.7, calcFunction.getX(180),eps);
        Assertions.assertEquals(2.0, calcFunction.getX(240),eps);
    }

    @Test
    public void testArrayY() {
        calcFunction.calculate(start, end, step);
        Assertions.assertEquals(-8.92688, calcFunction.getY(0),eps);
        Assertions.assertEquals(1.034503, calcFunction.getY(180),eps);
        Assertions.assertEquals(1.075528, calcFunction.getY(240),eps);
    }

    @Test
    void testGetMaxIbyValue() {
        calcFunction.calculate(2, 3, 0.5);
        Assertions.assertEquals(2, calcFunction.getMaxI(),eps);
    }
    @Test
    void testGetMinIbyValue() {
        calcFunction.calculate(2, 3, 0.5);
        Assertions.assertEquals(0, calcFunction.getMinI(),eps);
    }

    @Test
    void testGetSum() {
        calcFunction.calculate(2, 3, 1);
        Assertions.assertEquals(2.255205, calcFunction.getSum(),eps);
    }
    @Test
    void testGetAverage() {
        calcFunction.calculate(2, 3, 1);
        Assertions.assertEquals(1.127602, calcFunction.getAverage(),eps);
    }
}