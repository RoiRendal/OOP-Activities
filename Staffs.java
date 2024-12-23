public class Staffs
{
    public static void main(String[] args){

        //student
        Student student = new Student("Raimund Z. Gage", "Misamis Street", "Fine Arts", 2);
        
        System.out.println("Student Information:");
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getaddress());
        System.out.println("Student Program: " + student.getprogram());
        System.out.println("Student Year: " + student.getYear());
        
        //staff
        Staff staff = new Staff("Eliong Balagtas", "Legaspi Road", "AMA University", 28500.0);
        
        System.out.println("\nStaff Information:");
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getaddress());
        System.out.println("School: " + staff.getschool());
        System.out.println("Salary: ₱" + staff.getSalary());
    }
}



class Person
{
    protected String Name;
    protected String Address;
    
    //setters
    public void setName(String Name)
    {
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
    
    public String getaddress(){
        return Address;
    }
}



class Student extends Person{
    private String Program;
    private int year;
    
    public Student(String Name, String Address, String Program, int year)
    {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.year = year;
    }
    
    // setters
    public void setProgram(String Program)
    {
        this.Program = Program;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    //getters
    public String getprogram()
    {
        return Program;
    }
    
    public int getYear()
    {
        return year;
    }
}



class Staff extends Person
{

    private String School;
    private double Salary;
    
    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }
    
    //setters
    public void setschool(String School) {
        this.School = School;
    }
    
    public void setSalary(double Salary)
    {
        this.Salary = Salary;
    }
    
    //getters
    public String getschool()
    {
        return School;
    }
    
    public double getSalary(){
        return Salary;
    }
}