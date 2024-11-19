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

abstract class Shape
{
    protected String Color;
    protected Boolean Filled;
    
    public Shape()
    {
        Color = "white";
        Filled = true;
    }
    
    /*setters*/
    public void setFilled(Boolean filled)
    {
        this.Filled = filled;
    }
    
    public void setColor(String color)
    {
        this.Color = color;
    }
    
    
    /*getters*/

    public String getColor()
    {
        return Color;
    }
    
    public Boolean isFilled()
    {
        return Filled;
    }
    
    public abstract double getArea();
    public abstract double getTheBorder();
    
    @Override
    public String toString()
    {
        return "A Shape with color of " + Color + " and " + (Filled ? "filled" : "not filled");
    }
}

/*circle class to shape class inheritance*/
class Circle extends Shape
{
    private double Radius;

    public Circle(double radius, String color, Boolean filled)
    {
        super();
        this.Radius = radius;
        this.Color = color;
        this.Filled = filled;
    }
    
    /*setters*/
    public void setRadius(double radius)
    {
        this.Radius = radius;
    }

    /*getters*/
    
    public double getRadius()
    {
        return Radius;
    }
    
    @Override
    public double getArea()
    {
        return 3.14*Radius*Radius;
    }
    
    @Override
    public double getTheBorder()
    {
        return 2*3.14*Radius;
    }
    
    @Override
    public String toString()
    {
        return "circle with radius=" + Radius + ", which is a subclass of " + super.toString();
    }
}

/*rectangle class to shape class inheritiance*/
class Rectangle extends Shape
{
    private double Length;
    private double Width;
    
    public Rectangle(double length, double width, String color, Boolean filled)
    {
        super();
        this.Length = length;
        this.Width = width;
        this.Color = color;
        this.Filled = filled;
    }
    
    /*setters*/
    public void setLength(double length)
    {
        this.Length = length;
    }
    
    public void setWidth(double width)
    {
        this.Width = width;
    }
    
    /*getters*/
    public double getLength()
    {
        return Length;
    }
    
    public double getWidth()
    {
        return Width;
    }
    
    @Override
    public double getTheBorder()
    {
        return 2*(Length+Width);
    }

    @Override
    public double getArea()
    {
        return Length*Width;
    }
    
    
    @Override
    public String toString()
    {
        return "rectangle with width=" + Width + " and length=" + Length + " which is a subclass of " + super.toString();
    }
}

/*square class to Rectangle class inheritance*/
class Square extends Rectangle
{
    public Square(double side, String color, Boolean filled)
    {
        super(side, side, color, filled);
    }
    
    /*setter*/
    public void setSide(double side)
    {
        setLength(side);
        setWidth(side);
    }

    /*getter*/
    
    public double getSide()
    {
        return getLength();
    }
    
    @Override
    public String toString()
    {
        return "square with side=" + getSide() + " which is a subclass of " + super.toString();
    }
}
