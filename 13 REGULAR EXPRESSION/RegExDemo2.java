import java.util.regex.*;

public class RegExDemo2 {
    public static void main(String[] args) {

        // Character Classes
        Pattern p=Pattern.compile("[abc]");
        // Pattern p=Pattern.compile("[^abc]");
        // Pattern p=Pattern.compile("[a-z]");
        // Pattern p=Pattern.compile("[A-Z]");
        // Pattern p=Pattern.compile("[a-zA-Z]");
        // Pattern p=Pattern.compile("[0-9]");
        // Pattern p=Pattern.compile("[a-zA-Z0-9]");
        // Pattern p=Pattern.compile("[^a-zA-Z0-9]");

        Matcher m=p.matcher("a3b#k@9z");
        while (m.find()) {
            System.out.println(m.start()+"...."+m.group());
        }
    }
}
