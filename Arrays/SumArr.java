import java.util.*;
class SumArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int arr[] = new int[num]; // declaration and intialization
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0,max = arr[0],min = arr[0];
        for(int i = 0; i < num; i++){
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("Max ele of array: " + max);
        System.out.println("Min ele of array: " + min);
        sc.close();
    }
}