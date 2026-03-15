package ClassObject;
class CellPhone{
    String name;
    int mfd;
    String color;
    String type;
    double price;
    void phoneinfo(){
        System.out.println("The phone name is: " + name);
    }
}
public class DemoPhone {
    public static void main(String[] args){
        CellPhone obj = new CellPhone();
        obj.name = "Samsung";
        obj.color = "Black";
        obj.mfd = 2025;
        obj.price = 150000.0;
        obj.type = "Smart Phone";
        obj.phoneinfo();
        CellPhone obj2 = new CellPhone();
        obj2 = obj;
        obj2.phoneinfo();
        obj.name = "iPhone17";
        obj.phoneinfo();
        
        obj = null;
        // obj2 = obj;
        obj2.phoneinfo();
    }
}
