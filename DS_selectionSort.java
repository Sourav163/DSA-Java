package DS_Using_Java;

import java.util.Arrays;
public class DS_selectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {1, -5, 6, 8, 10, 0, -400};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            // Find the max item in the remaining array and swap with the correct index...
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap (arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start; i < end; i++)
        {
            if (arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
