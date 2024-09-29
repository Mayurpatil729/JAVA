import java.util.*;
class SwapNumbers3{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int z;
        System.out.println("Enter the two numbers for Swaping:");
        int x=in.nextInt();
        int y=in.nextInt();

        System.out.println("\nNumbers Before Swaping : ");
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        z=y;
        y=x;
        x=z;

        System.out.println("\nNumbers After Swaping : ");
        System.out.println("x="+x);
        System.out.println("y="+y);
        in.close();

    }
}






