package Shapes;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest  {

    Rectangle rectangle;

    @Before
    public void setup(){
        rectangle = new Rectangle();
    }

    @Test
    public void setLength() {
        rectangle.setLength(3);
        assertEquals(3, rectangle.getLength(), 0);
    }
    @Test
    public void getArea(){
        rectangle = new Rectangle(2.0,3);
        assertEquals(6,rectangle.getArea(),0);
    }
    @Test
    public void getPerimeter(){
        rectangle = new Rectangle(2.0,3);
        assertEquals(10,rectangle.getPerimeter(),0);
    }


}