package ClassObject;
import java.util.Scanner;
class Employee{
    public static void main(String[] args){
        String name;
        int age;
        long phone;
        double salary;
        char gender;
        String dept;
        int exp;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        phone = sc.nextLong();
        salary = sc.nextDouble();
        gender = sc.next().charAt(0);
        dept = sc.next();
        exp = sc.nextInt();
        System.out.println("Name: "+name + " Age: "+age+ " phone: " + phone + " salary: " + salary + " gender: " + gender + " dept: " + dept + " exp: " + exp);
        sc.close();
    }
}