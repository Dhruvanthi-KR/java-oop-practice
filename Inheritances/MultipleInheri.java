interface LandVehicle{
    void display();
}
interface WaterVehicle{
    void display();
}
class AmphiVehicle implements LandVehicle, WaterVehicle{
    public void display(){
        System.out.println("Multiple Inheritances");
    }
}
public class MultipleInheri {
    public static void main(String[] args){
        AmphiVehicle obj = new AmphiVehicle();
        obj.display();
    }
}
