package CalculateArea;

public class CalculateAreaAndPerimeter {
    private double area=0;
    private double perimeter=0;
    private double length;
    private double width;
    private double Side;
    private double radius;

    public CalculateAreaAndPerimeter() {
    }


    public double rectangleArea(double length , double width) {

        area = length * width;
        return area;
    }
    public double rectanglePerimeter(double length , double width) {
        perimeter = 2 * (length + width);
        return perimeter;

    }

    public double squareArea(double Side) {
        area = Side * Side;
        return area;
    }
    public double squarePerimeter(double Side) {
        perimeter = Side * 4;
        return perimeter;

    }

    public double circleArea(double radius) {
        area = (radius * radius) * Math.PI;
        return area;
    }
    public double circlePerimeter(double radius) {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
