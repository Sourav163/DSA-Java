package DS_Using_Java;

public class DS_recursionNumRev {
    /* 1. Recursive Way of Iteration */
    static int rev = 0;
    static void revNum(int n) {
        if(n == 0) {
            return;
        }
        rev = n%10 + rev*10;
        revNum(n/10);
    }

    /* 2. Using an Extra Variable */
    static int revNum0(int n, int arg) {
        if(n%10 == n) {
            return n;
        }
        return (n%10) * (int)(Math.pow(10, arg-1)) + revNum0(n/10, arg-1);
    }

    public static void main(String[] args) {
        int n = 125;
        int arg = (int)(Math.log10(n)) + 1;
        revNum(n);
        System.out.println(rev);
        System.out.println(revNum0(n, arg));
    }
}
