package DS_Using_Java;

public class DS_recursionFactorial {
    public static void main(String[] args) {
        int n = 5;
//        int n = 0;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
