package LabPrograms;
import java.util.*;
public class exp2 {
    static int sum_even = 0, prod_odd = 1, sum = 0; // global variables
    static double average;

    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    private static int fibonacci(int n){
        int f0 = 0, f1 = 1, f2 = 0, count = 0, larPrime = 0;
        while (count < n){
            count++;
            sum += f0;
            if(f0 % 2 == 0){
                sum_even += f0;
            }else{
                prod_odd *= f0;
            }
            if(isPrime(f0)){
                larPrime = f0;
            }
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        average = (double)sum / count;
        return larPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();

        int prime = fibonacci(n);
        System.out.println("Sum of even terms : "+sum_even);
        System.out.println("Product of odd terms : "+prod_odd);
        System.out.println("Average of these terms : "+average);
        if(prime != 0){
            System.out.println("Largest prime number : "+prime);
        }else{
            System.out.println("Prime number is not identified!");
        }
        sc.close();
    }
}
