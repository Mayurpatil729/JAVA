import java.util.*;
class SumN{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int n,i,sum=0;
        System.out.println("Enter the number : ");
        n=in.nextInt();
        in.close();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}




















