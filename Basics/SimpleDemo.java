import java.util.Scanner;
public class SimpleDemo{
    public static void main(String[] args){
        int age;
        String name;
        float cgpa;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        cgpa = sc.nextFloat();
        System.out.println("Name = " + name + " Age = " + age + " cgpa = " + cgpa);
    sc.close();
    }
}