package Patron;
import Librarys.Book;
public class Patron1 {
    public String name;
    public Patron1(String name){
        this.name = name;
        System.out.println("The patron with the name "+this.name+" can take the book");
    }
    public void borrow(Book b){
        System.out.println("The person "+name+" has borrowed "+ b.getTitle());
    }
}
