import java.util.*;
class SwitchString{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String str;
        System.out.println("Enter a month :");
        str = obj.next();
        switch(str){
            case "Jan": System.out.println("1st month January");
            break;
            case "Feb": System.out.println("2nd month February");
            break;
            case "Mar": System.out.println("3rd month March");
            break;
            case "Apr": System.out.println("4th month April");
            break;
            case "May": System.out.println("5th month May");
            break;
            case "Jun": System.out.println("6th month June");
            break;
            case "Jul": System.out.println("7th month July");
            break;
            case "Aug": System.out.println("8th month August");
            break;
            case "Sep": System.out.println("9th month September");
            break;
            case "Oct": System.out.println("10th month October");
            break;
            case "Nov": System.out.println("11th month November");
            break;
            case "Dec": System.out.println("12th month December");
            break;
            default:System.out.println("Invalid month !!");
            break;
        }obj.close();
    }
}