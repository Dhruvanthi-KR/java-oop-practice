/*
Create a Java program with a vehicle hierarchy, including Vehicle, Car, SportsCar, and 
Truck classes. Implement methods for starting and stopping in the base class and 
specialized methods for accelerating, adding turbo boost, and loading cargo in the 
subclasses, with appropriate method overrides.
*/

package LabPrograms;
// base class
class Vehicle {
    public void start(){
        System.out.println("Vehicle has been started");
    }
    public void stop(){
        System.out.println("Vehicle has been stopped");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car has been started");
    }
    @Override
    public void stop(){
        System.out.println("Car has been stopped");
    }
    public void accelerate(){
        System.out.println("Car has been accelerated");
    }
}
// take super class as car it can happen
class SportCar extends Car{
    @Override
    public void start(){
        System.out.println("Sport Car has been started");
    }
    @Override
    public void stop(){
        System.out.println("Sport Car has been stopped");
    }
    public void turboBoost(){
        System.out.println("Sport Car turbo mode is set");
    }
}
class Truck extends Vehicle{
    @Override
    public void start(){
        System.out.println("Truck has been started");
    }
    @Override
    public void stop(){
        System.out.println("Truck has been stopped");
    }
    public void loadCarbo(){
        System.out.println("Truck has been loaded");
    }
}
public class exp5 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
        c.accelerate();
        System.out.println("--------------------------------");
        SportCar sc = new SportCar();
        sc.start();
        sc.stop();
        sc.turboBoost();;
        System.out.println("--------------------------------");
        Truck t = new Truck();
        t.start();
        t.stop();
        t.loadCarbo();
        System.out.println("--------------------------------");
    }
}
