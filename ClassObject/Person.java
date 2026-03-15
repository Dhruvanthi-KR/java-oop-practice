package ClassObject;
class Persons{
    String name;
    char gender;
    int age;
    void walking(){
        System.out.println(name + " is walking");
    }
    void talking(){
        System.out.println(name + " is talking");
    }
}
public class Person{ // observe clearing there wil be two classes created
    public static void main(String[] args){
        Persons p1 = new Persons();
        Persons p2 = new Persons();
        p1.name = "Ram";
        p1.gender = 'M';
        p1.age = 20;
        p2.name = "Priya";
        p2.gender = 'F';
        p2.age = 21;
        p1.walking();
        p2.walking();
        p1.talking();
        p2.talking();
    }
}