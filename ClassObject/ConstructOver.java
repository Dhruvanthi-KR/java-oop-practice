package ClassObject;
class Box {
    double height, width, length;
    Box(){
        height = width = length = 0.0;
    }
    Box(double height, double width){
        this.height = height;
        this.width = width;
        this.length = 1.0;
    }
    Box(double h, double w, double l){
        height = h;
        width = w;
        length = l;
    }
}
class ConstructOver{
    public static void main(String[] args){
        Box obj1 = new Box();
        Box obj2 = new Box(2.0,3.0);
        Box obj3 = new Box(2.0,5.0,7.0);
        System.out.println("Height: "+obj1.height+" weight: "+obj1.width+" length: "+obj1.length);
        System.out.println("Height: "+obj2.height+" weight: "+obj2.width+" length: "+obj2.length);
        System.out.println("Height: "+obj3.height+" weight: "+obj3.width+" length: "+obj3.length);
    }
}