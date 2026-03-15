package ClassObject;
class Student{
    String name;
    int age;
    double m1, m2, m3;
    Student(){
        name = "Null";
        age = 0;
        m1 = 0.0;
        m2 = 0.0;
        m3 = 0.0;
    }
    Student(String name, int age, double m1, double m2, double m3){
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    void average(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        double avg = (m1+m2+m2)/3;
        System.out.println("Student name: "+avg);
    }
}
public class Stud {
    public static void main(String[] args){
        Student obj = new Student("Ram",20,40.0,60.0,70.0);
        obj.average();
    }
}
