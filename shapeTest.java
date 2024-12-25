/*activity 4: all at once!*/

/*main class*/
public class shapeTest
{
    public static void main(String[] args)
    {
        /*for the Circle*/
        Circle circle = new Circle(5.0, "red", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getTheBorder());
        
        /*for the Rectangle*/
        Rectangle rectangle = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("\n" + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getTheBorder());
        
        /*for the Square*/
        Square square = new Square(5.0, "green", true);
        System.out.println("\n" + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getTheBorder());
        /*polymorphism*/
        Shape shape1 = new Circle(3.0, "yellow", true);
        Shape shape2 = new Rectangle(2.0, 3.0, "purple", false);
        Shape shape3 = new Square(4.0, "orange", true);
        
        System.out.println("\n" + "Polymorphism:");
        System.out.println(shape1.getArea()); /*for circle getArea*/
        System.out.println(shape2.getArea()); /*for rectangle getArea*/
        System.out.println(shape3.getArea()); /*for square getArea*/
    }
}
