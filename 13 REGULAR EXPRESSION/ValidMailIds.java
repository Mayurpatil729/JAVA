import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidMailIds {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(args[0]);

        if(m.find() && m.group().equals(args[0]))
        {
            System.out.println(" Valid Mail ID ");
        }
        else
        {
            System.out.println(" Invalid Mail ID ");
        }
    }
}
// [a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-
// 9]+([.][a-zA-Z]+)
// +