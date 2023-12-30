package DS_Using_Java;

public class DS_maxWealth
{
    // Counting The Wealth Of Customers :
    static int[] maximumWealth(int[][] accounts)
    {
        int[] sum = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                sum[i] += accounts[i][j];
            }
        }
        return sum;
    }

    // Counting The Maximum Wealth :
    static int arr_max(int[] sum)
    {
        int max = 0;
        for (int i: sum)
            if (i > max)
            {
                max = i;
            }
        return max;
    }

    // Calculating The Customer Having Max Wealth :
    static int arr_customer(int[] sum, int max)
    {
        int temp = 5;
        for (int i = 0; i < sum.length; i++)
        {
            if (max == sum[i])
            {
                temp = i+1;
            }
        }
        return temp;
    }

    // The Main Function :
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3}, {2, 3, 5}, {9, 1, 6}, {3, 3, 7}};
        int[] sum = maximumWealth(arr);
        System.out.println("Customer_"+arr_customer(sum, arr_max(sum))
                                +" Has The Maximum Wealth Of "+arr_max(sum));
    }
}
