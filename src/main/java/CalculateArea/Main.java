package CalculateArea;

public class Main {
    public static void main(String[] args) {
        CalculateAreaAndPerimeter areaAndPerimeter = new CalculateAreaAndPerimeter();

        System.out.println("Area of rectangle is: " + areaAndPerimeter.rectangleArea(2,3));
        System.out.println("Perimeter of rectangle is: " + areaAndPerimeter.rectanglePerimeter(2,3));

        System.out.println("Area of Square is: " + areaAndPerimeter.squareArea(1.5));
        System.out.println("Perimeter of Square is: "+ areaAndPerimeter.squarePerimeter(1.5));

        System.out.println("Area of Circle is: " + areaAndPerimeter.circleArea(4));
        System.out.println("Perimeter of Circle is: "+ areaAndPerimeter.circlePerimeter(4));

    }

}
