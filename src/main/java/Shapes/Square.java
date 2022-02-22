package Shapes;

public class Square extends Shape {
    public Square() {

    }

    public Square(double width) {
        setWidth(width);
    }

    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4 * getWidth();
    }
}

