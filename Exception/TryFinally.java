public class TryFinally {
    public static void main(String[] args) {
        try{
            int a = 10 / 0;
            int b = 10 / 2;
            System.out.println("B value :"+b);
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("Finally block got executed");
            System.out.println("Program continues....!");
        }
    }
}
