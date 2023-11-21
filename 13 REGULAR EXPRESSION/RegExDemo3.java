import java.util.regex.*;

public class RegExDemo3 {
    public static void main(String[] args) {

        // Predefined Character Classes
        Pattern p=Pattern.compile("\\s");
        // Pattern p=Pattern.compile("\\S");
        // Pattern p=Pattern.compile("\\d");
        // Pattern p=Pattern.compile("\\D");
        // Pattern p=Pattern.compile("\\w");
        // Pattern p=Pattern.compile("\\W");
        // Pattern p=Pattern.compile(".");

        Matcher m=p.matcher("a3b#k@9z");
        while (m.find()) {
            System.out.println(m.start()+"...."+m.group());
        }
    }
}
