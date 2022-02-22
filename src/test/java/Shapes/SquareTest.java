package Shapes;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testGetArea() {
        Square square = new Square(4);
        assertEquals(16.0,square.getArea(),0);
    }

    public void testGetPerimeter() {
        Square square = new Square(4);
        assertEquals(16.0,square.getPerimeter(),0);
    }
}