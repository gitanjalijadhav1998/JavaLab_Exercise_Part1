package Shapes;

public class Circle extends Shape {
    public Circle(){

    }
    public Circle(double width){
        setWidth(width);
    }

    @Override
    public double getArea() {
        return Math.PI * getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * getWidth();
    }


}
