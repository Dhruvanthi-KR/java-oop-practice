package Interface;
interface Car{
    void start();
    void move();
    void stop();
    // private void display(){
    //     System.out.println("This is Private");
    // }
}
class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel car is starting");
    }
    public void move(){
        System.out.println("Diesel car is moving");
    }
    public void stop(){
        System.out.println("Diesel car has stopped");
    }
}
public class Example { 
    public static void main(String[] args){
        DieselCar obj = new DieselCar();
        obj.start();
        obj.move();
        obj.stop();
    }
}
