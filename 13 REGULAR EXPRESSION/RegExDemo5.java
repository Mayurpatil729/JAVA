import java.util.regex.*;

public class RegExDemo5 {
    public static void main(String[] args) {
        // // Pattern p = Pattern.compile("[.]");
        // Pattern p = Pattern.compile("\\.");
        // String[] s = p.split("www.google.com");

        // for (String s1 : s) {
        //     System.out.println(s1);
        // }

        String s="www google com";
        String[] s1=s.split("\\s");
        for(String s2:s1)
        {
            System.out.println(s2);
        }
        
    }
}


















