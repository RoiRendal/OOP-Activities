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
