package InterfaceFolder;
interface Car{
    void start();
}
interface Diesel extends Car{
    void DieselStart();
    void display();
}
interface Sedonn extends Car{
    void SedonnStart();
    void display();
}
class Hondai implements Diesel, Sedonn{
    public void start(){
        System.out.println("Hondai car is starting");
    }
    public void DieselStart(){
        System.out.println("Diesel car is starting");
    }
    public void SedonnStart(){
        System.out.println("Sedonn car is starting");
    }
    public void display(){
        System.out.println("Display method");
    }
}
public class DiamondInter {
    public static void main(String[] args) {
        Hondai obj = new Hondai();
        obj.start();
        obj.DieselStart();
        obj.SedonnStart();
        obj.display();
    }
}
