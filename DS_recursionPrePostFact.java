package DS_Using_Java;

public class DS_recursionPrePostFact {
    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }

    static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
//        fun(n--); // Throw EndLess Error.
        fun(--n);
    }

}
