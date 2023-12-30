package DS_Using_Java;

public class DS_arrayEvenDigit
{
    // Counting digits
    static int digit(int x, int y)
    {
        while (y>0)
        {
            x++;
            y = y/10;
        }
        return x;
    }

    // Counting even digits
    static int even_digit(int x, int y)
    {
        while (y>0)
        {
            if(y%2 == 0)
            {
                x++;
            }
            y = y/10;
        }
        return x;
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 345, 2, 6, 7896};
        int c = 0, d = 0, e = 0, f = 0;
        for (int i : arr)
        {
            System.out.println(i+" Number Has "+digit(c, i)+" Digits.");
            if (digit(c, i) % 2 == 0)
            {
                System.out.println("Contains Even No. Of Digits.");
            }
            else
            {
                System.out.println("Contains Odd No. Of Digits.");
            }
            System.out.println("\t"+even_digit(d, i)+" Even Digits.");
            while (i != 0)
            {
                e++;
                i /= 10;
            }
            if (e%2 == 0)
            {
                f++;
            }
        }
        System.out.println("\n'arr' Contains "+f+" Numbers Having Even Number of Digits.");
    }
}