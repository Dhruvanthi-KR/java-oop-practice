public class AllException {
    public static void main(String[] args) {
        try{
            int num = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
        try{
            String name = null;
            System.out.println("String length: "+name.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception: "+e);
        }
        try{
            String str = "Hello";
            int i = Integer.parseInt(str);
        }
        catch(NumberFormatException e){
            System.out.println("Exception: "+e);
        }
        try{
            int arr[] = new int[3];
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }
        try{
            String section = null;
            System.out.println("String :"+section.length());
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }
    }
}
