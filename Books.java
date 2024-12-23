public class Books
{
    public static void main(String[] args)
    {
        
        Book book1 = new Book();
        book1.set_BookNumber(29);
        book1.set_title("Goodbye Eri");
        book1.set_Author("Tatsuki Fujimoto");
        book1.set_Price(839.00);
        
        System.out.println("\n++++++++Book details++++++++");
        System.out.println("Book number: " + book1.get_Book_number());
        System.out.println("Title: " + book1.get_Title());
        System.out.println("Author: " + book1.get_Author());
        System.out.println("Price: ₱" + book1.get_price());
    }
}


class Book
{
    private int Book_number;
    private String title;
    private String author;
    private double Price;
    
    //setter
    public void set_BookNumber(int Book_number)
    {
        this.Book_number = Book_number;
    }
    
    public void set_title(String title)
    {
        this.title = title;
    }
    
    public void set_Author(String author) {
        this.author = author;
    }
    
    public void set_Price(double Price){
        this.Price = Price;
    }
    
    //getters
    public int get_Book_number()
    {
        return Book_number;
    }
    
    public String get_Title(){
        return title;
    }
    
    public String get_Author()
    {
        return author;
    }
    
    public double get_price()
    {
        return Price;
    }
}