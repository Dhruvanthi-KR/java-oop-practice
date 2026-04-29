/*
develop a java program illustrating constructor overloading
for calculating area of rectangle and circle using app constuctor
*/
package LabPrograms;

class Area {
    int length, breadth;
    double radius;
    Area(int l, int b) {
        length = l;
        breadth = b;
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    Area(double r) {
        radius = r;
        double area = 3.14 * radius * radius;
        System.out.printf("Area of Circle: %.2f", area);
    }
}

public class exp4 {
    public static void main(String[] args) {
        Area rect = new Area(5, 4);   // Rectangle
        Area circle = new Area(3.0);  // Circle
    }
}
