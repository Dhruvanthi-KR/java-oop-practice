import java.util.*;
public class SumRow {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n, m;
        System.out.println("Enter row and col");
        n = ob.nextInt();
        m = ob.nextInt();
        int arr[][] = new int[n][m];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ;j++){
                arr[i][j] = ob.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ;j++){
                sum += arr[i][j];
            }System.out.println("Sum of row: "+ sum);
            sum = 0;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sum += arr[j][i];
            }System.out.println("Sum of column: "+ sum);
            sum = 0;
        }
        ob.close();
    }
}
