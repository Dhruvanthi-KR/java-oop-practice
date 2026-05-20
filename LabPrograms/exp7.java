package LabPrograms;
import Librarys.*;
import Patron.*;
public class exp7 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Harry Potter");
        Patron1 p1 = new Patron1("Alice");
        // Patron1 p2 = new Patron1("Alice");
        p1.borrow(b1);
    }
}
