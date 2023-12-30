package DS_Using_Java;

public class DS_recursionSum {
    public static void main(String[] args) {
        int n = 5;
//        int n = 0;
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }
}
