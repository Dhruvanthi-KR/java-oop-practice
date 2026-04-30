class InvalidWeightException extends Exception{
    public InvalidWeightException(String msg){
        super(msg);
    }
}
public class CustomException {
    void checkWeight(int weight) throws InvalidWeightException{
        if(weight > 5){
            throw new InvalidWeightException("Drone can't handle more than 5kg");
        }else{
            System.out.println("Drone Successfully delivered the package");
        }
    }
    public static void main(String[] args) {
        CustomException obj = new CustomException();
        try{
            obj.checkWeight(7);
        }
        catch(InvalidWeightException e){
            System.out.println(e.getMessage());
        }
    }
}
