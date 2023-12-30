package DS_Using_Java;

import java.util.Arrays;

public class DS_recSorting {
    public static void main(String[] args) {
//        int[] arr = {10, -2, 3, 1, 5};
        int[] arr = {5, 6, 3, 1, 2};

//        arr = bubbleSort(arr, 5, 0);
//        for (int index : arr)
//            System.out.print(index + "\t");

//        bubbleSortVoid(arr, arr.length -1, 0);
//        System.out.println(Arrays.toString(arr));

//        selectionSort(arr, 0, 1);
//        System.out.println(Arrays.toString(arr));

        selectionSortMax(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] bubbleSort(int[] arr, int n, int index) {
        if (n == 0) {
            return arr;
        }

        if (arr[index] > arr[index +1]) {
            int temp = arr[index];
            arr[index] = arr[index +1];
            arr[index +1] = temp;
        }
        if (index < n-2)
            bubbleSort(arr, n, index +1);

        return bubbleSort(arr, n -1, 0);
    }

    static void bubbleSortVoid(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (row > col) {
            if (arr[col] > arr[col +1]) {
                int temp = arr[col];
                arr[col] = arr[col +1];
                arr[col +1] = temp;
            }
            bubbleSortVoid(arr, row, col +1);
        }
        else
            bubbleSortVoid(arr, row -1, 0);
    }

    static void selectionSort(int[] arr, int index, int innerIndex) {
        if (index == arr.length -1) {
            return;
        }

        if (arr[index] > arr[innerIndex]) {
            int temp = arr[index];
            arr[index] = arr[innerIndex];
            arr[innerIndex] = temp;
        }
        if (innerIndex < arr.length -1)
            selectionSort(arr, index, innerIndex +1);

        selectionSort(arr, index +1, index +2);
    }

    static void selectionSortMax(int[] arr, int element, int index, int max) {
        if (element == 1) {
            return;
        }

        if (element > index) {
            if (arr[index] > arr[max])
                selectionSortMax(arr, element, index +1, index);
            else
                selectionSortMax(arr, element, index +1, max);
        }

        else {
            int temp = arr[max];
            arr[max] = arr[element -1];
            arr[element -1] = temp;
            selectionSortMax(arr, element -1, 0, 0);
        }
    }
}
