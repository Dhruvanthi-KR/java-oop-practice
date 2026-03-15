import java.util.Scanner;
class LoopPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        num = sc.nextInt();
        int flag = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        //int i = 2;
        // while(i < num){
        //     if(num % i == 0){
        //         flag = 1;
        //         break;
        //     }
        //     i++;
        // }
        // do{
        //     if(num % i == 0){
        //         flag = 1;
        //         break;
        //     }
        //     i++;
        // }while(i < num); 
        if(flag == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}