package DS_Using_Java;

public class DS_stringSeries {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' +i);
            System.out.print(ch);
            series = series +ch;
        }
        System.out.print("\n"+series);
    }
}