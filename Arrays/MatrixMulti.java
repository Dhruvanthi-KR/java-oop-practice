import java.util.*;
public class MatrixMulti {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m, p, q;
        System.out.println("Enter rows and columns of Matrix A:");
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Enter rows and columns of Matrix B:");
        p = sc.nextInt();
        q = sc.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[p][q];
        System.out.println("Enter matrix A elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix B elements:");
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                B[i][j] = sc.nextInt();
            }
        }
        if(m != p){
            System.out.println("Matrix multiplication not possible");
        }
        else{
            int C[][] = new int[n][q];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < q; j++){
                    for(int k = 0; k < m; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("Result Matrix:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < q; j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}