import Geometry.Rectangle;
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
    }
}
