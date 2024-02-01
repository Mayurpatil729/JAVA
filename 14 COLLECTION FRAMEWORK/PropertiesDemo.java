import java.io.*;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("M:\\CODING\\PROGRAMER729\\JAVA\\14 COLLECTION FRAMEWORK\\abc.properties");
        p.load(fis);
        System.out.println(p); //{Venki=9999, pwd=tiger, user=scott}
        String s=p.getProperty("Venki");
        System.out.println(s); // 9999
        p.setProperty("nag","88888");
        FileOutputStream fos=new FileOutputStream("M:\\CODING\\PROGRAMER729\\JAVA\\14 COLLECTION FRAMEWORK\\abc.properties");
        p.store(fos,"Updated by Mayur for java Revision");

    }
}
