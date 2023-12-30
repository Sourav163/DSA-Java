package DS_Using_Java;

public class DS_recursionZeroCount {
    public static void main(String[] args) {
        int n = 304600;
        System.out.println(countZero(n, 0));
    }

    static int countZero(int n, int c) {
        if(n == 0)
            return c;
        else if(n%10 == 0)
            return countZero(n/10, c+1);
        else
            return countZero(n/10, c);
    }
}
