import java.util.*;

class ArraySum{
    public static void main(String...args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        int sum=0,i;
        float avg;
        
        in.close();
        System.out.println("Enter "+a.length+" numbers ");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        avg=(float)sum/a.length;
        
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }
}
