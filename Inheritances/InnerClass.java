class Outer{
    int age = 20;
    String name = "Ram";
    void Display(){ // this wil not execute
        System.out.println("Inside the outer class");
        Inner obj = new Inner();
        obj.display();
    }
    class Inner{
        double cgpa = 9.30;
        void display(){
            System.out.println("Inside the inner class");
            System.out.println("Age: "+age);
            System.out.println("Name: "+name);
            System.out.println("Cgpa: "+cgpa);
        }
    }
    // void Show(){
    //     System.out.println("Cgpa: "+cgpa);
    // }
    //if u create variables here u can't access these by inner class becoz they need to declared above
}
public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.display();
    }
}
