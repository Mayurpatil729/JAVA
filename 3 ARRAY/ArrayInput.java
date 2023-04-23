import java.util.*;

class ArrayInput {
    public static void main(String...args){
            try(Scanner in = new Scanner(System.in)){
            int[] a= new int[5];
            int i;

            System.out.println("Enter "+a.length+" numbers :");
            
            for(i=0;i<a.length;i++)
            {
                a[i]=in.nextInt();
            }
            
            System.out.println("\nArray Elements are :");
            
            for(int x:a)
            {
                System.out.println(x);
            }
        }
    }
}
