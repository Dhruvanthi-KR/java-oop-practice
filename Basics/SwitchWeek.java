import java.util.*;
class SwitchWeek{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int day;
        System.out.println("Enter a number 0-6 :");
        day = obj.nextInt();
        switch(day){
            case 0: System.out.println("Sunday");
            break;
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tueday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            default:System.out.println("Invalid Number !!");
            break;
        }
        obj.close();
    }
}