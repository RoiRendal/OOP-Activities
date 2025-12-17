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