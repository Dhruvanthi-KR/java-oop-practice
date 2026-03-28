abstract class Vehicle{ // abstract class => whc has atleast one abstract method
    abstract void Move(int wheels); // no defination
    void display(){ // this is concrete method
        System.out.println("This is Parent class");
    }
}
class Car extends Vehicle{
    void Move(int wheels){ // abstract method defination wil be done in sub class
        System.out.println("Car can move with "+wheels+" wheels");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car(); // abstract class can't instantiated so create obj for sub class
        c.Move(4);
        c.display();
        // Vehicle v = new Vehicle(); error: Vehicle is abstract; cannot be instantiated
    }
}
