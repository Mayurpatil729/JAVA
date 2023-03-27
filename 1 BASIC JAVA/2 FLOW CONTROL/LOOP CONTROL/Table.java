import java.util.*;

class Table {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Table of a given number : ");
        int n;
        n=in.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i); // we can direct use variable 
        }
        in.close();
    }
}







