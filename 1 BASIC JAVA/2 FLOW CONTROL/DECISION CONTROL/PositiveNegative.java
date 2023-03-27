import java.util.*;

class PositiveNegative {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter any number to check given number is postive or negative :");
        n=in.nextInt();
        
        in.close();
        if(n>0)
        {
            System.out.println(n+" is positive number");
        }
        if(n<0)
        {
            System.out.println(n+" is negative number");
        }
    }
}




























