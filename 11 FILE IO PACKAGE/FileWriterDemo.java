import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception 
    {
        FileWriter fw = new FileWriter("ABC.txt");
        //Override
        // FileWriter fw = new FileWriter("ABC.txt",true);
        //Append
        fw.write("\n");
        fw.write(109);
        fw.write("ayur patil \n");
        fw.write("Software engineer");
        fw.write("\n");
        char[] ch1 = { 'a', 'b', 'c' };
        fw.write(ch1);
        fw.flush();
        fw.close();
    }

}
