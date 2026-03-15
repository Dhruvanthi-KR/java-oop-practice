class Calculation{
    void multi(int a,int b){
        System.out.println("Multiplication: "+a*b);
    }
    void multi(double a,double b){
        System.out.println("Multiplication: "+a*b);
    }
    int multi(int a,int b, int c){
        return a*b*c;
    }
    double multi(double a){
        return a*10.0;
    }
}
class CalcOver{
    public static void main(String[] args){
        Calculation obj = new Calculation();
        System.out.println(obj.multi(5,3,4));
        obj.multi(3, 4);
        obj.multi(4.0, 3.0);
        System.out.println(obj.multi(5.0));
    }
}