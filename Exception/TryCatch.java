import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int arr[] = new int[5];
        String s = null;

        System.out.println("Division is being done");
        try{// it depends on order of statements
            System.out.println(s.length());
            double res = num1/num2;
            System.out.println(arr[6]);
            System.out.println("Result: "+res);
        }
        // it doesn't depends on order of catch block
        catch(ArithmeticException e){
            System.out.println("Error : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e);
        }
        catch(Exception e){
            System.out.println("An Exception occured : "+e);
        }
        System.out.println("Division is completed");
        sc.close();
    }
}
