package ClassObject;
class Box{
    double height; // instance variables
    double width;
    double breadth;

    void volume(){ // instance method
        System.out.println(height*width*breadth);
    }
}
public class ClassDemo{
    public static void main(String[] args){
        Box obj1 = new Box(); // object for class box
        obj1.height = 2.0;
        obj1.width = 5.0;
        obj1.breadth = 3.0;
        Box obj2 = new Box();
        obj2.height = 10.9;
        obj2.width = 40.0;
        obj2.breadth = 90.0;
        System.out.println(obj1.height + " " + obj1.width + " " + obj1.breadth);
        System.out.println(obj2.height + " " + obj2.width + " " + obj2.breadth);
        obj1.volume();
        obj2.volume();
    }
}