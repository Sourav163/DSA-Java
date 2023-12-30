package DS_Using_Java;

public class DS_recursionNumDir {
    public static void main(String[] args) {
        System.out.println("Printing in Asc. :");
        printOrd(1);
        System.out.println();
        System.out.println("Printing in Dsc. :");
        printRev(1);
        System.out.println();
        System.out.println("Printing in Both Asc. And Dsc. :");
        printBoth(1);
    }

    static void printOrd(int n) {
        if (n > 5) {
            return;
        }
        System.out.print("\t" + n);
        printOrd(n+1);
    }

    static void printRev(int n) {
        if (n > 5) {
            return;
        }
        printRev(n+1);
        System.out.print("\t" + n);
    }

        static void printBoth(int n) {
        if (n > 5) {
            System.out.println();
            return;
        }
        System.out.print("\t" + n);
        printBoth(n+1);
        System.out.print("\t" + n);
    }
}