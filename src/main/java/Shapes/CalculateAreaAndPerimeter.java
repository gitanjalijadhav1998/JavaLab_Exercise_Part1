package Shapes;

public class CalculateAreaAndPerimeter {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5);

        System.out.println("The perimeter of the circle is " + circle.getPerimeter());
        System.out.println("The area of the circle is: " + circle.getArea() + "\n");

        Square square = new Square(4);

        System.out.println("The perimeter of the square is " + square.getPerimeter());
        System.out.println("The area of the square is: " + square.getArea() + "\n");

        Rectangle rectangle = new Rectangle(2.0,3);

        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is: " + rectangle.getArea() +"\n");

    }

}
