public class EncapsulationSample
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.set_id(2316160);
        student1.setName("Roi Rendal");
        
        System.out.println("Student id: " + student1.get_ID());
        System.out.println("Student name: " + student1.getName());
        
    }
}

class Student
{
    private int Student_id;
    private String Name;
    // setters
    public void set_id(int Student_id)
    {
        this.Student_id = Student_id;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    //getters
    public int get_ID()
    {
        return Student_id;
    }
    
    public String getName() {
        return Name;
    }
}