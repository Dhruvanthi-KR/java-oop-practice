package Interface;
class Person{
    String name;
    int age;
    int marks;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void Calculate(Person p){ // call by value
        p.age = this.age + p.age; // here this is refering to p1 object
    }
}

public class CallReference {
    public static void main(String[] args) {
        Person p1 = new Person("Ram", 23);
        Person p2 = new Person("Prajwal", 21);
        System.out.println("Age of "+p1.name+" is "+p1.age);
        System.out.println("Age of "+p2.name+" is "+p2.age);
        p1.Calculate(p2);
        System.out.println("Age of "+p1.name+" is "+p1.age);
        System.out.println("Age of "+p2.name+" is "+p2.age);
    }
}
