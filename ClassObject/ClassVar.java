package ClassObject;
class Box{
    static int h; // class variable
    int w; // instance variable
    int l;
    void display(){
        System.out.println("height: " + h + " width:" + w + " length: " + l);
    }
    static void display_det(){
        System.out.println("Its is static method");
    }
}

public class ClassVar {
    public static void main(String[] args){
        Box obj1 = new Box();
        // obj1.h = 20;
        obj1.w = 30;
        obj1.l = 40;
        Box obj2 = new Box();
        //obj2.h = 24; if use this then it will change the value of h for all the objects because h is static variable
        obj2.w = 40;
        obj2.l = 90;
        obj1.display();
        obj2.display();
        Box.display_det();
    }
}
