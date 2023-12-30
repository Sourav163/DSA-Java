package DS_Using_Java;

import java.util.Scanner;

public class DS_fibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The n-th Number Of fibonacci Number :  ");
        long n = sc.nextInt();
        System.out.println(n + "th Fibonacci Number Is :  " + Fibo(n));
    }

    static long Fibo (long n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5) - Math.pow(((1 - Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}