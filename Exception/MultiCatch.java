import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        try{
            int num1 = sc.nextInt();
            System.out.println(num1);
            System.out.println(name.length());
        }
        catch(InputMismatchException e){
            System.out.println("Exception: "+e);
        }
        catch(NullPointerException e){
            System.out.println("Exception: "+e);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        sc.close();
    }
}
