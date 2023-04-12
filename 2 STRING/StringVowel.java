import java.util.*;

class StringVowel{
    public static void main(String...args) {
        Scanner in=new Scanner(System.in);
        // in.close();

        int c=0,x;
        System.out.println("Enter the String : ");
        String s=in.nextLine();
        
        for(x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        } 
        System.out.println("Vowels : "+c);
        in.close();
    }
}













