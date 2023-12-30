package DS_Using_Java;

public class DS_recursionDigitSum {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digitSum(n));
    }

    static int digitSum(int n) {
        if(n == 0)
            return 0;

//        if(n/10 == 0)
//            return n;

        return n%10 + digitSum(n/10);
    }
}
