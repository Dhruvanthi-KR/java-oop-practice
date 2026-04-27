package LabPrograms;

class Phone{
    void dialing(){
        System.out.println("This is Phone class with name ");
    }
}

class CameraPhone extends Phone{
    void dialing(String name){
        System.out.println("This is Camera phone class with name " + name);
    }
}

class SmartPhone extends Phone{
    void dialing(String name, int price){
        System.out.println("This is Smart phone class "+name+" with cost of "+price);
    }
}

public class exp3 {
    public static void main(String[] args) {
        CameraPhone obj1 = new CameraPhone();
        SmartPhone obj2 = new SmartPhone();
        obj1.dialing();
        obj1.dialing("nokia");
        obj2.dialing("samgung", 90000);
    }
}
