package DS_Using_Java;

import java.util.Arrays;
import java.util.Scanner;
public class DS_sortedMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Target :  ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;    // Be cautious, matrix may be empty...
        if (rows == 1)
        {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        // Run the loop till two rows are remaining :
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1))    // While this is true it will have more than 2 rows...
        {
            int rMid = rStart + (rEnd-rStart)/2;
            if (matrix[rMid][cMid] == target)
            {
                return new int[] {rMid, cMid};
            }
            else if (matrix[rMid][cMid] < target)
            {
                rStart = rMid;
            }
            else if (matrix[rMid][cMid] > target)
            {
                rEnd = rMid;
            }
        }
        // Now we have two rows :
        // Check whether the target is in the column of two rows :
        if (matrix [rStart][cMid] == target)
        {
            return new int[] {rStart, cMid};
        }
        else if (matrix [rStart+1][cMid] == target)
        {
            return new int[] {rStart+1, cMid};
        }
        // Search in 1st half :
        if (target <= matrix[rStart][cMid-1])
        {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // Search in 2nd half :
        else if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1])
        {
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        // Search in 3rd half :
        else if (target <= matrix[rStart+1][cMid-1])
        {
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // Search in 4th half :
        else if (target >= matrix[rStart+1][cMid+1] && target <= matrix[rStart+1][cols-1])
        {
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
        return new int[] {-1, -1};
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target )
    {
        while (cStart <= cEnd)
        {
            int cMid = cStart + (cEnd-cStart)/2;
            if (matrix[row][cMid] == target)
            {
                return new int[] {row, cMid};
            }
            else if (matrix[row][cMid] < target)
            {
                cStart = cMid+1;
            }
            else if (matrix[row][cMid] > target)
            {
                cEnd = cMid-1;
            }
        }
        return new int[] {-1, -1};
    }
}
