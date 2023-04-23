import java.util.*;
class Reverse{
    public static void main(String...x)
    {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int n=in.nextInt();
        
        int reverse=0;
        while(n!=0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        
        in.close();
        System.out.println("The reverse of given number : "+reverse);
    }
}