public class NestedTryCatch {
    public static void main(String[] args) {
        try{ // first try block
            int[] b = new int[5];
            System.out.println(b[5]);
            try{ // second try block
                int[] arr = new int[3];
                System.out.println(arr[3]);
                try { // third try block
                    int a = 10 / 0;
                    // String str = null;
                    // int n = str.length();
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index is out of bounds");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds");
            }
        }
        catch(ArithmeticException e){
            System.out.println("This is arithmetic exception");
            System.out.println("Exception :" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception :"+ e);
        }
        catch(Exception e){
            System.out.println("Exception Occured");
        }
    }
}
