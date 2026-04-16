package Geometry.OtherShapes;

public class Triangle {
    private double height, base;
    int side = 5;
    protected int def = 5;
    
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    public double Area(){
        return 0.5*height*base;
    }
}
