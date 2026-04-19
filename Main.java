// import Geometry.OtherShapes.*;
// import Geometry.otherShapes.Triangle;
import Geometry.*;
// import Geometry.*;
public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4.5,5.0);
        double area = obj.Area();
        System.out.println("Area of rectangle : "+ area);

        Square obj1 = new Square(10);
        int areaa = obj1.Area();
        System.out.println("Area of Square : "+ areaa);

        Geometry.OtherShapes.Triangle obj2 = new Geometry.OtherShapes.Triangle(3.0,5.0 );
        double a = obj2.Area();
        System.out.println("Area of Triangle : "+ a);
        // System.out.println(obj2.side); DEFAULT 
        // error: side is not public in Triangle; cannot be accessed from outside package
        // System.out.println(obj2.def); PROTECTED
        // error: def has protected access in Triangle
    }
}
