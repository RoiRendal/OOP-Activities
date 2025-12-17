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
