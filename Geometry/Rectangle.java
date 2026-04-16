package Geometry;

public class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){ // constructor
        this.length = length;
        this.breadth = breadth;
    }
    public double Area(){ // method
        return length * breadth;
    }
}

