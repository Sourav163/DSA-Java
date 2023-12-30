package DS_Using_Java;

import java.util.Arrays;

public class DS_recMergeSort {
    public static void main(String[] args) {
//        int[] arr = {8, 3, 4, 12, 5, 6};
        int[] arr = {5, 4, 3, 2, 1};

//        System.out.println(Arrays.toString(mergeSort(arr)));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[left.length + right.length];

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if ((end - start) == 1)
            return;

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] merged = new int[end - start];

        while(i < mid && j < end) {
            if(arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            }
            else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < merged.length; l++)
            arr[start + l] = merged[l];
    }
}
