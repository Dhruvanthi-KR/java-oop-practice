import java.util.*;
class LoopFact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        // for(int i=1; i<=num; i++){
        //     fact *= i;
        // }
        int i = 1;
        // while(i<=num){
        //     fact *= i;
        //     i++;
        // }
        do{
            fact *= i;
            i++;
        }while(i<=num);
        System.out.println("factorial = " + fact);
        sc.close();
    }
}