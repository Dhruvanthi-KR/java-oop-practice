package ClassObject;
class Thing{
    double h,w,l;
    double volume(){
        return h*w*l;
    }
    void multiplyVol(int a){
        double v = h*l*w;
        System.out.println(v*a);
    }
}
public class Box{
    public static void main(String[] args){
        Thing obj = new Thing();
        obj.h = 2.0;
        obj.w = 2.0;
        obj.l = 2.0;
        obj.multiplyVol(10);
    }
}
