package Interface;
interface Car{
    void start();
    default void move(){
        System.out.println("car is starting");
    }
    static void stop(){
        System.out.println("car has stopped");
    }
}
class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel car is starting");
    }
}
public class InterFaceEx {
    public static void main(String[] args){
        DieselCar obj = new DieselCar();
        obj.start();
        obj.move();
        Car.stop();
    }
}
