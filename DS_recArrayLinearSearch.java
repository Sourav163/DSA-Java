package DS_Using_Java;

import java.util.ArrayList;

public class DS_recArrayLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 18, 1, 18, 9};
        int target = 18;
//        int target = 180;
        System.out.println("Target Element is Present in the Array :  " + searchBool(arr, target, 0));

        System.out.println("\nBy Searching from First Index, Target Element is Found at Position no. " + searchIndex(arr, target, 0) + " of the Array.");

        System.out.println("By Searching from Last Index, Target Element is Found at Position no. " + searchIndexLast(arr, target, arr.length-1) + " of the Array.");

        searchAllIndex(arr, target, 0);
        System.out.println("\nBy Using Global Variable, Target Element is Found at Position nos. " + listIndex + " of the Array.");

        System.out.println("By Using Parameter, Target Element is Found at Position nos. " + searchAllIndexList(arr, target, 0, new ArrayList<>()) + " of the Array.        THE BEST CASE");

        System.out.println("By Using Function Variable, Target Element is Found at Position nos. " + searchAllIndexListVar(arr, target, 0) + " of the Array.");
    }

    static boolean searchBool(int[] arr, int target, int index) {
        if(index == arr.length)
            return false;
        return target == arr[index] || searchBool(arr, target, index+1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if(index == arr.length)
            return -1;
        if(target == arr[index])
            return index;
        return searchIndex(arr, target, index+1);
    }

    static int searchIndexLast(int[] arr, int target, int index) {
        if(index == -1)
            return -1;
        if(target == arr[index])
            return index;
        return searchIndex(arr, target, index-1);
    }

    static ArrayList<Integer> listIndex = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index) {
        if(index == arr.length)
            return;
        if(target == arr[index])
            listIndex.add(index);
        searchAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> searchAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length)
            return list;
        if(target == arr[index])
            list.add(index);
        return searchAllIndexList(arr, target, index+1, list);
    }

    static ArrayList<Integer> searchAllIndexListVar(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        if(target == arr[index]) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = searchAllIndexListVar(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
