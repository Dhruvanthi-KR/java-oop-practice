package Threads;
class MovieTicket {
    int seats = 1;
    void bookTicket(String name) {
        synchronized (this) {
            if (seats > 0) {
                System.out.println(name + " booked the ticket");
                seats--;
            } else {
                System.out.println(name + " could not book ticket");
            }
        }
    }
}

class Person extends Thread {
    MovieTicket mt;
    Person(MovieTicket mt) {
        this.mt = mt;
    }
    public void run() {
        mt.bookTicket(Thread.currentThread().getName());
    }
}

public class BookTicket {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        Person p1 = new Person(mt);
        Person p2 = new Person(mt);
        Person p3 = new Person(mt);
        p1.setName("Person 1");
        p2.setName("Person 2");
        p3.setName("Person 3");
        p1.start();
        p2.start();
        p3.start();
    }
}