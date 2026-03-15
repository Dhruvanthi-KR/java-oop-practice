class Animal{
    String name;
    void sound_animal(){
        System.out.println("This is Animal class");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("This is Cat class");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("This is Dog class");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("This is Cow class");
    }
}
class AnimalClass{
    public static void main(String[] args){
        Dog obj1 = new Dog();
        obj1.sound();
        obj1.sound_animal();
        obj1.name = "Abcd";
        Animal obj = new Animal();
        obj.sound_animal();
        // obj.sound();
        Cat obj2 = new Cat();
        obj2.sound();
        obj2.sound_animal();
        Cow obj3 = new Cow();
        obj3.sound();
        obj3.sound_animal();
    }
}