/*activity 3: implementation of polymorphism*/

public class Inheritance
{
    public static void main(String[] args)
    {
        Student student = new Student("Roi Rendal", "Balayan, Batangas", "BSIT", 2);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        System.out.println(student.toString());
    }
}

class Person
{
    protected String Name;
    protected String Address;
    
    /*setters*/
    public void setName(String Name)
    {
        this.Name = Name;
    }
    
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    
    /*getters*/
    public String getName()
    {
        return Name;
    }
    
    public String getAddress()
    {
        return Address;
    }

    @Override
    public String toString()
    {
        return "Hello I am " + Name + " and  " + "I lived in " + Address + ".";
    }
}

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
    
    /*setters*/
    public void setProgram(String Program)
    {
        this.Program = Program;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    /*getters*/
    public String getProgram()
    {
        return Program;
    }
    
    public int getYear()
    {
        return year;
    }
    
    @Override
    public String toString()
    {
        return "Hello I am " + Name + " I lived in " + Address + ". I am " + year + " year of " +Program + ".";
    }
}
