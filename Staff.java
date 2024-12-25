public class Staff extends Person {
    private String School;
    private double Salary;
    
    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }
    
    //setters
    public void setSchool(String School) {
        this.School = School;
    }
    
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    //getters
    public String getSchool() {
        return School;
    }
    
    public double getSalary() {
        return Salary;
    }
}
