package DS_Using_Java;

public class DS_orderAgnosticBS
{
    public static void main(String[] args)
    {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 22, 45};
        int[] arr = {45, 7, 2, 0, -1, -22, -100, -812};
        int target = -100;
        int ans = orderAgnosticBS(arr, target);
        System.out.println("Element "+target+" is Present at the Index :  "+ans);
    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int s = 0, e = arr.length-1;
        // Find whether the array is sorted in ascending or descending :
        boolean isAsc = arr[s] < arr[e];
        /*
            if (arr[s] < arr[e]) :  isAsc = true;
            else :  isAsc = false;
         */
        while (s <= e)
        {
            int m = s+(e-s)/2;
            if(arr[m] == target)
            {
                return m;
            }
            if (isAsc)
            {
                if (target < arr[m])
                {
                    e = m - 1;
                }
                else if (target > arr[m])
                {
                    s = m + 1;
                }
            }
            else
            {
                if (target < arr[m])
                {
                    s = m + 1;
                }
                else if (target > arr[m])
                {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
