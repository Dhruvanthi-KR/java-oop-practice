class Animal{ // if u use final keyword used=> error: cannot inherit from final Animal
    final int decible = 50;
    final void Move(){
        System.out.println("Inside Animal Class");
    }
}
class Cat extends Animal{
    /* 
    @Override void Move(){ error: Move() in Cat cannot override Move() in Animal
        // overridden method is final
        System.out.println("Inside Cat Class");
    }
    */
}
public class FinalKeyword {
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.decible);
        //obj.decible = 40; => error: cannot assign a value to final variable decible
    }
}
