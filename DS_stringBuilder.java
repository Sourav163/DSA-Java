package DS_Using_Java;

import java.util.Arrays;
public class DS_stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' +i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        String name = "Hi Sourav Routray !  Welcome.";
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
