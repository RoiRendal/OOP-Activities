public class Student extends Person
{
    private String Program;
    private int year;
    
    public Student(String Name, String Address, String Program, int year)
    {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.year = year;
    }
    
    //setters
    public void setProgram(String Program)
    {
        this.Program = Program;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    //getters
    public String getProgram()
    {
        return Program;
    }
    
    public int getYear() {
        return year;
    }
}
