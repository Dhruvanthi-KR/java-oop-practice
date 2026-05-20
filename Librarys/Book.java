package Librarys;

public class Book{
    private String title;
    public Book(String title){
        this.title = title;
        System.out.println("Book with title "+this.title+" is added.");
    }
    public String getTitle(){
        return this.title;
    }
}
