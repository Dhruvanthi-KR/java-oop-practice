package ClassObject;
class Box {
    private double height;
    double width;
    protected double length;
    Box(){
        height = 1.0;
        width = 2.0;
        length = 3.0;
    }
    protected void display(){
        System.out.println("Height: "+height);
        System.out.println("width: "+width);
        System.out.println("length: "+length);
    }
}
public class Access{
    public static void main(String[] args){
        Box obj1 = new Box();
        //private access
        obj1.display();
        //default access
        obj1.width = 30.0;
        obj1.display();
        //protected access
        obj1.length = 50.0;
        obj1.display();
    }
}