package Strings;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "Hello NCET"; // String literals Approach -> string constant pool inside heap memory
        String str2 = new String("Hello NCET"); // String object Approach -> inside heap memory
        String str3 = "Hello";
        String str4 = new String("Hello NCET"); // String object Approach -> inside heap memory
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
        System.out.println(str1 == str2); 
        // false : it compare the referance address so str1 and str2 are at diff location
        System.out.println(str1.equals(str2)); // true it checks the values of string
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3));
        System.out.println(str2 == str4); // false
        System.out.println(str2.equals(str4)); // true it checks the values of string
        
        System.out.println("String1 length : "+str1.length()); // length of string

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(6));
        // System.out.println(str1.charAt(10)); //Index 10 out of bounds for length 10

        System.out.println(str1.compareTo(str3)); // compares ASCII value and return 0 / 1 / -1
    }
}
