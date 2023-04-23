import java.util.*;

class StartsWithA {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[] s=new String[5];

        System.out.println("Enter "+s.length+" Names :");
        for(int i=0;i<s.length;i++)
        s[i]=in.nextLine();
        in.close();

        System.out.println("Names Starts with A or a are as follows : ");
        for(String t:s)
        {
            if(t.charAt(0)=='A' || t.charAt(0)=='a')
            System.out.println(t);
        }
    }
}
