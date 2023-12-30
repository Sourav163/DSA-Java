package DS_Using_Java;

public class DS_recursionDigitProduct {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digitProduct(n));
    }

    static int digitProduct(int n) {
        if(n == 1)
            return 1;

//        if(n%10 == n)
//            return n;

        return n%10 * digitProduct(n/10);
    }
}
