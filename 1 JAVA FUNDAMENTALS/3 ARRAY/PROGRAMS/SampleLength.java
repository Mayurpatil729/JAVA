import java.util.*;

class SampleLength{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] s=new String[5];

        System.out.println("Enter "+s.length+" Strings :");

        for(int i=0;i<s.length;i++)
        s[i]=in.nextLine();

        in.close();
        System.out.println("Length of all Strings are ");
        for(String t:s)
            System.out.println("Length of "+t+" is "+t.length());
    }
    
}
