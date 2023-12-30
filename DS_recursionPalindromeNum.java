package DS_Using_Java;

public class DS_recursionPalindromeNum {
    public static void main(String[] args) {
        int n = 151;
        int arg = (int)(Math.log10(n)) + 1;
        pali(n, arg);
        System.out.println(paliCheck(n, arg));
    }

    static int rev(int n, int arg) {
        if(n%10 == n) {
            return n;
        }
        return (n%10) * (int)(Math.pow(10, arg-1)) + rev(n/10, arg-1);
    }

    static void pali(int n, int arg) {
        if(rev(n, arg) == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static boolean paliCheck(int n, int arg) {
        return n == rev(n, arg);
    }
}
