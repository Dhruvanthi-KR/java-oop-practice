/*
Develop a Java lab program that handles exceptions for division by zero and invalid 
input. Use `try-catch` blocks to catch `Arithmetic Exception` for division by zero and 
`Input Mismatch Exception` for non-integer input and provide user-friendly error 
messages. 
 */
package LabPrograms;
import java.util.*;
public class exp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        while(true){
            while(true){ // input for 1st numb
                try{
                    System.out.println("Enter the first number");
                    a = sc.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    System.out.println("Enter the valid integer");
                    sc.nextLine(); // enter to read 
                }
            }
            while(true){ // input for 2nd numb
                try{
                    System.out.println("Enter the second number");
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println("The result of division : "+c);
                    break;
                }
                catch(InputMismatchException e){
                    System.out.println("Enter the valid integer");
                    sc.nextLine(); // enter to read 
                }
                catch(ArithmeticException e){
                    System.out.println("Division by zero is not possible");
                }
            }
        }
        // sc.close();
    }
}
