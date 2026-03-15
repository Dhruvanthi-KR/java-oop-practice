import java.util.*;
class ArrTwoD{
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
        System.out.println("Array elements are: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}