public class Throw {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
    }
}
