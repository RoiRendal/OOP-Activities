public class InheritanceSample
{
    public static void main(String[] args)
    {
        Student student = new Student("Juan", "Batangas PH", "BSIT", 2);
        
        System.out.println("Student Information:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        
        Staff staff = new Staff("Maria Santos", "Manila PH", "College of Engineering", 50000.0);
        
        System.out.println("\nStaff Information:");
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
    }
}
