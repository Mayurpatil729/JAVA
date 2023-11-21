import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abbabbba");
        
        int count=0;
        while (m.find()) {
            count++;
            // System.out.println(m.start());
            System.out.println(m.start()+"...."+m.end()+"...."+m.group());
        }
        System.out.println("The total number of occurrences : "+count);
    }
}
