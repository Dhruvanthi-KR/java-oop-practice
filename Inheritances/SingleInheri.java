class Vehicle{
    String Name;
    Vehicle(){
        System.out.println("Constructor of Vehicle class");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Constructor of Car class");
    }
}
public class SingleInheri {
    public static void main(String[] args){
        //Car obj = new Car(); 
        /*  whn obj created for car class its calls the vehicle 
        constructor is called and thn car class (sub)
        */
    }
}
