import java.util.*;
class SumTwoD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c]; //declaration and intialization
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0, max = arr[0][0],min = arr[0][0];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c;j++){
                sum += arr[i][j];
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("Max ele of array: " + max);
        System.out.println("Min ele of array: " + min);
        sc.close();
    }
}