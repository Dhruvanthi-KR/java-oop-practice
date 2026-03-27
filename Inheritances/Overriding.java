class Animal{
    void Move(){
        System.out.println("Inside the animal class");
    }
    void display(){
        System.out.println("Display method");
    }
    // here only MOVE method is overridden
    /* it matters
    1.method name
    2.numb of parameters
    3.type of parameters
    4.return type
    it does not matter
    1.name of parameters(variables)
     */
    static void Sound(int decible){
        System.out.println("Animal Sound Upto "+decible+" decible");
    }
}
class Cat extends Animal{
    //@override : can be written like this also
    @Override void Move(){ // if mistake(Spellings) happens, the complier wil understands tht it shld override
        // super.Move() : if u want to execute the parent method
        System.out.println("Inside the cat class");
    }
    static void Sound(int dec){
        System.out.println("Animal Sound Upto "+dec+" decible");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal obj = new Cat(); //=> reference datatype is parent class using 
        // sub class constructor
        obj.Move();
        //obj.Sound(10); //uncomment it to see static function
        //obj = new Dog(); //=> reusing the obj can happens
        Cat c = new Cat();
        c.Move(); // overrides the method present in the super class and executes the method presnt in sub class
        //c.Sound(50); //uncomment it to see static function
    }
}
