//Write a program to merge data of 2 file4 and file5 and write in file6 wheredata
// shoul be altenatily entered

import java.io.*;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class FileMerger2 {
    public static void main(String[] args) throws Exception 
    {
        PrintWriter pw=new PrintWriter("file6.txt");
        BufferedReader br1=new BufferedReader(new FileReader("file4.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("file5.txt"));
        String line1=br1.readLine();
        String line2=br2.readLine();

        while((line1!=null) || (line2!=null))
        {
            if(line1!=null)
            {
                pw.println(line1);
                line1=br1.readLine();
            }
            if(line2!=null)
            {
                pw.println(line2);
                line2=br2.readLine();
            }
        }
    }
}
