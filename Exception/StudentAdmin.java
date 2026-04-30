class AdmissionException extends Exception{
    public AdmissionException(String msg){
        super(msg);
    }
}
public class StudentAdmin {
    void StudentCount(int count) throws AdmissionException{
        if(count > 250){
            throw new AdmissionException("Admission closed!");
        }else{
            System.out.println("Admission open");
        }
    }
    public static void main(String[] args) {
        StudentAdmin obj = new StudentAdmin();
        try{
            obj.StudentCount(240);
        }
        catch(AdmissionException e){
            System.out.println(e.getMessage());
        }
    }
}
