package ClassObject;
class Cars{
    String color;
    int no_of_seat;
    int model;
    void display(){
        System.out.println("Color : " + color);
        System.out.println("Numb of seat : " + no_of_seat);
        System.out.println("Model : " + model);
    }
}
public class Car{
    public static void main(String[] args){
        Cars obj1 = new Cars();
        Cars obj2 = new Cars();
        obj1.color = "Red";
        obj2.color = "Black";
        obj1.no_of_seat = 5;
        obj2.no_of_seat = 4;
        obj1.model = 9740;
        obj2.model = 3456;
        obj1.display();
        obj2.display();
    }
}