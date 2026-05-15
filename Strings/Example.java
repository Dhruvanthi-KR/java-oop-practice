package Strings;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        String greeting = "Hello "+name;
        name = "Hello "+name; // re assigns
        System.out.println("The name is : " + greeting); // The name is : Hello Dhruv
        System.out.println("The name is : " + name); // The name is : Hello Dhruv

        String str1 = "hello";
        String str2 = "NCET";
        String str3 = "Hello";
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        sc.close();
    }
}
