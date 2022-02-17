package CalculateArea;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class CalculateAreaAndPerimeterTest {
    CalculateAreaAndPerimeter test;

    @org.junit.Before
    public void setUp() throws Exception {
        test = new CalculateAreaAndPerimeter();

    }

    @org.junit.Test
    public void rectangleArea() throws Exception {
        //CalculateAreaAndPerimeter rectArea = new CalculateAreaAndPerimeter();
        double area = test.rectangleArea(2, 3);
        assertEquals(6, area, 0);

    }

    @org.junit.Test
    public void rectanglePerimeter() throws Exception {
        //CalculateAreaAndPerimeter rectPeri = new CalculateAreaAndPerimeter();
        double peri = test.rectanglePerimeter(2, 3);
        assertEquals(10, peri, 0);
    }

    @org.junit.Test
    public void squareArea() throws Exception {
        double area = test.squareArea(1.5);
        assertEquals(2.25, area, 0);

    }

    @org.junit.Test
    public void squarePerimeter() throws Exception {
        double peri = test.squarePerimeter(1.5);
        assertEquals(6, peri, 0);
    }

    @org.junit.Test
    public void circleArea() throws Exception {
        double area = test.circleArea(4);
        assertEquals(50.26548245743669, area, 0);
    }

    @org.junit.Test
    public void circlePerimeter() throws Exception {
        double peri = test.circlePerimeter(4);
        assertEquals(25.132741228718345, peri, 0);
    }}