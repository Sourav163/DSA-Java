package DS_Using_Java;

public class DS_recArraySortBool {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 13, 4, 5};
        System.out.println("The given array is Sorted :  " + sortBool(arr, 0));
    }

    static boolean sortBool(int[] arr, int index) {
        if(index == arr.length-1) {
            return true;
        }
        return arr[index] < arr[index+1] && sortBool(arr, index+1);
    }
}
