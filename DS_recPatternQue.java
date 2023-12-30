package DS_Using_Java;

public class DS_recPatternQue {
    public static void main(String[] args) {
//        recPattern0(4, 0);
//        recPattern1(4, 0);
    }

    static void recPattern0(int row, int col) {
        if (row == 0)
            return;

        if (row > col) {
            System.out.print("* ");
            recPattern0(row, col +1);
        }
        else {
            System.out.println();
            recPattern0(row - 1, 0);
        }
    }

    static void recPattern1(int row, int col) {
        if (row == 0) {
            return;
        }

        if (row > col) {
            recPattern1(row, col +1);
            System.out.print("* ");
        }
        else {
            recPattern1(row - 1, 0);
            System.out.println();
        }
    }
}
