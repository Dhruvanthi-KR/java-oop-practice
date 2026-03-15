import java.util.*;
class LoopFibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series: ");
        for(int i=0; i<num; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}