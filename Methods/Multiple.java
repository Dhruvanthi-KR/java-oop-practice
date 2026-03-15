import java.util.*;
class Multiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 1;
        while(i < 100){
            num = sc.nextInt();
            if((num != 0) && (num % 10 == 0)){
                break;
            }
            System.out.println(num);
        }
        sc.close();
    }
}