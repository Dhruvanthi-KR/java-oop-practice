import java.util.*;
class Numb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 1;
        while(i < 10){
            num = sc.nextInt();
            if(num == 10){
                break;
            }
        }
        sc.close();
    }
}