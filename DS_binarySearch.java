package DS_Using_Java;

public class DS_binarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 22, 45};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println("Element "+target+" is Present at the Index :  "+ans);
    }

    // Return Index :
    // Return (-1) if doesn't exist :
    static int binarySearch (int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            // Find the middle element :
            // int mid = (start + end) / 2;
            // Might be possible that (start + end) / 2 exceeds the range of int in java.
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return (-1);
    }
}
