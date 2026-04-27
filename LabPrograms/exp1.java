/*
1. Develop a Java program for an advanced arithmetic calculator that takes two integer operands and an operator from the user. 
The program should be capable of performing addition, subtraction, multiplication, and division. 
Ensure that the program handles input validation, including checking for the validity of the operator and non-negative values for the operands. 
After each calculation, ask the user if they want to perform another operation and provide a history of previous calculations upon request.
 */
package LabPrograms;
import java.util.*;
public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        String history = "";
        boolean continueOp = true;
        while (continueOp) {
            System.out.println("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            num2 = sc.nextInt();
            System.out.println("Enter the operator: ");
            op = sc.next().charAt(0);
            if(num1 > 0 && num2 > 0){
                double result;
                switch(op){
                    case '+': result = num1 + num2;
                    System.out.println(" "+num1 + " "+op+ " "+num2+" = "+ result);
                    history += " "+num1 + " "+op+ " "+num2+" = "+ result+"\n";
                    break;
                    case '-': result = num1 - num2;
                    System.out.println(" "+num1 + " "+op+ " "+num2+" = "+ result);
                    history += " "+num1 + " "+op+ " "+num2+" = "+ result+"\n";
                    break;
                    case '*': result = num1 * num2;
                    System.out.println(" "+num1 + " "+op+ " "+num2+" = "+ result);
                    history += " "+num1 + " "+op+ " "+num2+" = "+ result+"\n";
                    break;
                    case '/': result = num1 / num2;
                    System.out.println(" "+num1 + " "+op+ " "+num2+" = "+ result);
                    history += " "+num1 + " "+op+ " "+num2+" = "+ result+"\n";
                    break;
                    default: System.out.println("It is invalid operator");
                    break;
                }
                System.out.println("Do you want to continue? (yes/no)");
                String input = sc.next();
                if(input.equalsIgnoreCase("no")){
                    continueOp = false;
                }
            }
            else{
                System.out.println("Enter positive numbers only !");
                continue;
            }
        }
        System.out.println("Do you want history? (yes/no)");
        String input = sc.next();
        if(input.equalsIgnoreCase("yes")){
            System.out.println("History is as follows : ");
            System.out.println(history);
        }
        sc.close();
    }
}
