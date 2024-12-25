public class PolymorphismSample {
    public static void main(String[] args) {
        Student student = new Student("Juan", "Batangas PH", "BSIT", 2);
        
        Staff staff = new Staff("Maria Santos", "Manila PH", "College of Engineering", 50000.0);
        
        System.out.println("Student Information:");
        System.out.println(student.toString());
        
        System.out.println("\nStaff Information:");
        System.out.println(staff.toString());
    }
}
