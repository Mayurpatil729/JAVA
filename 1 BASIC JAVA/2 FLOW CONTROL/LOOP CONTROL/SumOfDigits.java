import java.util.*;

class SumOfDigits{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        int n,r,sum=0;
        System.out.println("Enter the numbers : ");
        n=in.nextInt();

        while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of Digits = "+sum); 
        in.close();
    }
}














