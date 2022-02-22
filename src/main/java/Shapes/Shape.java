package Shapes;

public abstract class Shape {
    private double width;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}

