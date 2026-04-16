package InterfaceFolder;
interface A{
    void Display();
}
interface B{
    void Show();
}
class C implements A,B{
    public void Display(){
        System.out.println("From A Class in Class C");
    }
    public void Show(){
        System.out.println("From B Class in Class C");
    }
}
public class MultiInheri {
    public static void main(String[] args) {
        C obj = new C();
        obj.Display();
        obj.Show();
    }
}
