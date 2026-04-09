package Interfaces;
interface Car{
    void start();
    void move();
    void display();
}
class Diesel implements Car{
    public void start(){
        System.out.println("Diesel car starting");
    }
    public void move(){
        System.out.println("Diesel car is moving");
    }
    public void display(){
        System.out.println("Inside Diesel car");
    }
    void reverse(){
        System.out.println("Diesel car is being reversed");
    }
}
class Petrol implements Car{
    public void start(){
        System.out.println("Petrol car starting");
    }
    public void move(){
        System.out.println("Petrol car is moving");
    }
    public void display(){
        System.out.println("Inside Petrol car");
    }
    void reverse(){
        System.out.println("Petrol car is being reversed");
    }
}
public class CarInterface {
    public static void main(String[] args){
        Diesel obj = new Diesel();
        obj.start();
        obj.move();
        obj.display();
        obj.reverse();
        Petrol obj1 = new Petrol();
        obj1.start();  
        obj1.move();
        obj1.display();
        obj1.reverse();
    }
}
