class Vehicle{
    String Name;
    Vehicle(){
        System.out.println("Constructor of Vehicle class");
    }
    void display_Vehicle(){
        System.out.println("Display of Vehicle class");
    }
}
class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("Constructor of FourWheeler class");
    }
}
class Car extends FourWheeler{
    Car(){
        System.out.println("Constructor of Car class");
    }
}
public class MultiLevel{
    public static void main(String[] args){
        Car obj = new Car();
        obj.display_Vehicle();
    }
}
