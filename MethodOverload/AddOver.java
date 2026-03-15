class Addition {
    void add(){
        System.out.println("value: " + (3 + 5));
    }
    void add(int a){
        System.out.println("value: " + (a+10));
    }
    void add(int a, int b, int c){
        System.out.println("values: " + (a+b+c));
    }
    void add(double a, double b){
        System.out.println("values: " + (a+b));
    }
    int add(int a, int b){
        return a+b;
    }
}
class AddOver{
    public static void main(String[] args){
        Addition obj = new Addition();
        obj.add();
        obj.add(5);
        obj.add(2,3,5);
        obj.add(2.0, 3.0);
        System.out.println(obj.add(3,5));
    }
}
