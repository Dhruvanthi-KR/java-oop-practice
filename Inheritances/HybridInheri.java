class Vehicle{
    int wheels;
    String type;
    void display(){
        System.out.println("This is vehicle class");
    }
}
class Car extends Vehicle{ // single inheritance
    void display(){
        System.out.println("Car Class wheels: "+wheels);
    }
}
class Bus extends Vehicle{
    void display(){
        System.out.println("Bus Class wheels: "+wheels);
    }
}
class Mini extends Bus{ // multi level inheritance
    void display(){
        System.out.println("Mini Class wheels: "+wheels);
    }
}
public class HybridInheri {
    public static void main(String[] args){
        Mini m = new Mini();
        m.display();
    }
}
