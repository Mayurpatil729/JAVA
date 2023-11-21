import java.util.regex.*;

public class RegExDemo4 {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("a");
        //Exactly one 'a'.
        Pattern p=Pattern.compile("a+");
        //At least one 'a'.
        Pattern p=Pattern.compile("a*");
        //Any no. of a's including zero number.
        Pattern p=Pattern.compile("a?");
        // At most one 'a'

        Matcher m=p.matcher("a3b#k@9z");
        while (m.find()) {
            System.out.println(m.start()+"...."+m.group());
        }
    }
}
