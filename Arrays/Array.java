import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        float arr[] = new float[num]; // declaration and intialization
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("Array elements are: ");
        for(float i: arr){
            System.out.println(i);
        }
        sc.close();
    }
}