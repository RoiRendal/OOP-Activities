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