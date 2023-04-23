import java.util.*;

class Factorial{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");
        long n=in.nextInt();
        int i,fact=1;
        in.close();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}


















