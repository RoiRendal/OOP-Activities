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
