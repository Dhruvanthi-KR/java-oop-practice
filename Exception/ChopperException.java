class InvalidWeightException extends Exception{
    public InvalidWeightException(String msg){
        super(msg);
    }
}
public class ChopperException {
    void checkYourWeight(int weight) throws InvalidWeightException{
        if(weight > 60){
            throw new InvalidWeightException("Chopper can only handle upto 60kgs");
        }else{
            System.out.println("Chopper can handle");
        }
    }
    public static void main(String[] args) {
        ChopperException obj = new ChopperException();
        try{
            obj.checkYourWeight(50);
        }
        catch(InvalidWeightException e){
            System.out.println(e.getMessage());
        }
    }
}
