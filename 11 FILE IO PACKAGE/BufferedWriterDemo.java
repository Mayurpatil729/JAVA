import java.io.BufferedWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        FileWriter fw=new FileWriter("ABCDE.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write(100);
        bw.newLine();
        char[] ch1={'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("Mayur");
        bw.newLine();
        bw.write("Software engineer");
        bw.flush();
        bw.close();
    }
    
}
