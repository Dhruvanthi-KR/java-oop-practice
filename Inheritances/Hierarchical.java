class Vehicle{
    int wheels;
    String type;
    Vehicle(){ // if no sub class constructors is created, 
    // is goes to the super class constructor to execute
        wheels = 10;
        type = "Goods";
    }
    void Display(){

    }
}
class Car extends Vehicle {
    Car(){ // if created it wil executes this
        super(); // by default it wil call if not mentioned
        wheels = 4;
        type = "Passanger";
    }
    void Display_Car(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Type: "+type);
    }
}
class Bus extends Vehicle {
    void Display_Bus(){
        System.out.println("Wheels:"+wheels);
        System.out.println("Type: "+type);
    }
}
public class Hierarchical { // Driver class
    public static void main(String[] args){
        Car c1 = new Car(); // default constructor is called becoz we didnt create, 
        // it is called during object creation
        c1.Display_Car();
        Bus b1 = new Bus();
        b1.Display_Bus();
    }
}
