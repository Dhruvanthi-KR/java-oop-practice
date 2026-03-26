class Parent{
    int age;
    String name;
    Parent(){

    }
    Parent(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class Child extends Parent{
    int age;
    Child(){
        super(50, "Ram"); //wrt constructor it becomes method
        age = 20;
        //super(50, "Ram"); =>:call to super must be first statement in constructor
    }
    void display(){
        System.out.println("this is child's age: "+ age);
        System.out.println("this is parent's age: "+super.age);
        System.out.println("Name: "+name);
    }
}
public class SuperConstructor {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}
