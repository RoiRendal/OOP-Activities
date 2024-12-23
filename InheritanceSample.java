public class InheritanceSample
{
    public static void main(String[] args)
    {

        Student student = new Student("Juan", "Batangas PH", "BSIT", 2);
        

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        
        System.out.println("Student Year: " + student.getYear());
    }
    
}


//person class
class Person{
    protected String Name;
    protected String Address;
    
    //setters
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    
    //getters
    public String getName()
    {
        return Name;
    }
    
    public String getAddress()
    {
        return Address;
    }
}


//inheritiance
class Student extends Person
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
