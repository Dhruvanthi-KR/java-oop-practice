package Strings;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Count of characters : "+str.length());
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'e'|| ch == 'u' || ch == 'o' || 
                ch == 'A' || ch == 'I' || ch == 'E'|| ch == 'U' || ch == 'O'){
                count++;
            }
        }
        System.out.println("count of vowels : "+count);
        sc.close();
    }
}
