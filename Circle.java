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
