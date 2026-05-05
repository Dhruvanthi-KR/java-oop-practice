package Threads;

class Restaurant extends Thread{
    private String name;
    public Restaurant(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("Chef is preparing food names as "+name);
    }
}

public class RestMenu {
    public static void main(String[] args) {
        Restaurant t1 = new Restaurant("Biryani");
        Restaurant t2 = new Restaurant("Soya Chap");
        Restaurant t3 = new Restaurant("Pallav");
        Restaurant t4 = new Restaurant("Sandwitch");
        Restaurant t5 = new Restaurant("Roti");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
