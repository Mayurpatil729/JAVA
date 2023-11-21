import java.io.*;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws Exception
    {
        FileWriter fw=new FileWriter("xyz.txt");
        PrintWriter out=new PrintWriter(fw);

        out.write(100);
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("Enginner");
        out.flush();
        out.close();
    }
}
