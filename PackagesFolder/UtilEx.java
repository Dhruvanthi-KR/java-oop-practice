import java.lang.Math;
import java.lang.String;
// import java.lang.*;
import java.util.*;
public class UtilEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int radius = sc.nextInt();
        double area = Math.PI *Math.pow(radius,2);
        System.out.printf("Area of circle : %.2f\n",area);
        System.out.println("Length of name : " + name.length());
        sc.close();
    }
}
