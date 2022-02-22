package Shapes;

public class Rectangle extends Shape {
        private double length;

    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }


    @Override
    public double getArea() {
        return getWidth() * getLength();
    }
    @Override
    public double getPerimeter() {
        return 2* (getLength() + getWidth());
    }


}
