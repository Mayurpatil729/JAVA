import java.util.*;

class StringPallindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str=in.nextLine();

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev=rev+ch;
        }

        if(str.equals(rev))
        {
            System.out.println("\tPallindrome String");
        }
        else
        {
            System.out.println("\tNot a Pallindrome String ");
        }
        in.close();
    }
}





