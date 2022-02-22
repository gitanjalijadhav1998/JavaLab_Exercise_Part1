package Shapes;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest  {

    @Test
    public void testGetArea() {
        Circle circle = new Circle(1.5);
        assertEquals(7.0685834705770345,circle.getArea(),0);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(1.5);
        assertEquals(9.42477796076938,circle.getPerimeter(),0);
    }
}