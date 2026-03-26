class Parent{
    int age = 50;
    String name = "Ram";
    void display(){
        System.out.println("Parent age: "+age);
        System.out.println("Parent name: "+name);
    }
}
class Child extends Parent{
    int age; // same variable name we can access the parent vari by super keyword
    void display(){
        super.display(); // wrt method
        System.out.println("this is child's age: "+ age);
        System.out.println("this is parent's age: "+super.age); // wrt variable
        System.out.println("Name: "+name);
    }
}
public class SuperKeyword {
    public static void main(String[] args){
        Child c = new Child();
        c.age = 20;
        c.display();
    }
}
