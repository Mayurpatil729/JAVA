import java.util.StringTokenizer;

public class RegExDemo6 {
    public static void main(String[] args) {
        // StringTokenizer st=new StringTokenizer("Mayur Patil");
        StringTokenizer st=new StringTokenizer("12-11-2023","-");
        // default regular expression for the StringTokenizer is space.

        while(st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
    }
}




















