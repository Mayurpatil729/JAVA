import java.util.*;

class Stars{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Program to print patterns :");
        System.out.println("Enter the number : ");
        int n=in.nextInt();
        
        in.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.println("*");
            }
            System.out.println(" ");
        }
    }
}





















































