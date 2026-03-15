import java.lang.Math;
class MathFunc{
    public static void main(String[] args){
        int numb = 9;
        double num = 20.9;
        double sq = Math.sqrt(numb);
        double cb = Math.cbrt(8);
        double ceil = Math.ceil(num);
        double floor = Math.floor(num);
        double round = Math.round(num);
        double power = Math.pow(2,4);
        System.out.println("Square Root: " + sq);
        System.out.println("Cube Root: " + cb);
        System.out.println("Max: " + Math.max(10,20));
        System.out.println("Min: " + Math.min(10,20));
        System.out.println("Ceil value: " + ceil);
        System.out.println("Floor value: " + floor);
        System.out.println("Round value: " + round);
        System.out.println("Power value: " + power);
        System.out.println("Random value: " + Math.random());
    }
}
