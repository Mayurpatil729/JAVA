import java.util.regex.*;
import java.io.*;


public class FileNameExtractor {
    public static void main(String[] args) throws Exception
    {
        Pattern p=Pattern.compile("[a-zA-Z0-9_$.]+[.]txt");
        File f=new File("M:\\Learnin");

        String[] s=f.list();

        int count=0;
        for(String s1:s)
        {
            Matcher m=p.matcher(s1);
            if(m.find() && m.group().equals(s1))
            {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println(count);
    }
}




