package DS_Using_Java;

import java.util.Scanner;
public class DS_recursionIntro {
    public static void main(String[] args) {
//        print1(1); // Without Using Recursion :

//        print(1); // Using Recursion :
//    }

    /* Without Using Recursion :

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
    }
}                               */

    /* Using Recursion :

    static void print(int n) {
        if (n>5) {
            return;
        }

        System.out.println(n);
        print(n+1);
    }
}                               */


        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The n-th Number Of fibonacci Number :  ");
        int n = sc.nextInt();
        System.out.print(n + "th Fibonacci Number Is :  " + Fibo(n));
    }

    static int Fibo(int n) {
        if (n < 2) {
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
