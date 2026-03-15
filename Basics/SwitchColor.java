import java.util.*;
class SwitchColor{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int color;
        System.out.println("Enter a char of color :");
        color = obj.next().charAt(0);
        switch(color){
            case 'R','r': System.out.println("Red");
            break;
            case 'P','p': System.out.println("Pink");
            break;
            case 'O','o': System.out.println("Orange");
            break;
            case 'Y','y': System.out.println("Yellow");
            break;
            case 'B','b': System.out.println("Blue");
            break;
            case 'W','w': System.out.println("White");
            break;
            case 'G','g': System.out.println("Grey");
            break;
            default:System.out.println("Invalid color !!");
            break;
        }
        obj.close();
    }
}