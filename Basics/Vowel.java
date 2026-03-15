import java.util.*;
class Vowel{
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    switch(ch){
        case 'A','a':
            System.out.println("Vowel");
            break;
        case 'E','e':
            System.out.println("Vowels");
            break;
        case 'I','i':
            System.out.println("Vowels");
            break;
        case 'O','o':
            System.out.println("Vowels");
            break;
        case 'U','u':
            System.out.println("Vowels");
            break;
        default:
            System.out.println("Consonaut");
            break;
    } sc.close();
    }
}