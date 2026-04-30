public class task {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println("String length: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
        finally{
            System.out.println("Finally Block...!");
        }
    }
}
