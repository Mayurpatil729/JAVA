import java.util.*;

class OddOrEven{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the number to check given number is odd or even : ");
        int n=in.nextInt();
        
        if (n%2==0)
        System.out.println("Given number is even ");
        else
        System.out.println("Given number is odd ");
        in.close();
    }
}

