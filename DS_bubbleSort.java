package DS_Using_Java;

import java.util.Arrays;
public class DS_bubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 5, -7, 11, 8, -9, 0};
        bubble (arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr)
    {
        boolean swapped;
        // Run the array (n-1) times...
        for (int i = 0; i < arr.length; i++)
        {
            swapped = false;
            // For each index max item will come at the end respective index...
            for (int j = 1; j < arr.length-i; j++)
            {
                // Swap if the item is smaller than the previous item...
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // If you didn't swap for a particular value of 'i',
            //      it means the array is sorted hence stop the program...
            if (! swapped)  // ! false = true
            {
                break;
            }
        }
    }
}
