// package Exception;
import java.util.*;
public class TryBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Division is being done");
        // execution of the program wil never change
        try{
            double res = num1/num2; // if num2 is 0 this causes ArithmeticException
            // and the program will terminate abruptly, so place it inside try block
            System.out.println("Result: "+res);
        }
        catch(Exception e){
            System.out.println("An Exception occured : "+e);
        }
        System.out.println("Division is completed");
        sc.close();
    }
}
