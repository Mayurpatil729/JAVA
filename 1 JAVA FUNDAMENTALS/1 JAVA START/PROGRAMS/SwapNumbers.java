import java.util.*;

class SwapNumbers{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the two numbers for Swaping:");
        int x=in.nextInt();
        int y=in.nextInt();
        
        System.out.println("\nNumbers Before Swaping : ");
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("\nNumbers After Swaping : ");
        System.out.println("x="+x);
        System.out.println("y="+y);
        in.close();
    }
}


