package PACKAGE.Pac1;
import java.util.*;

public class Sum
{
    public static void main(String[] args){
        try(Scanner in =new Scanner(System.in)){
        
        int n1, n2,add;
        System.out.println("Enter The Two numbers for addition : ");
        n1=in.nextInt();
        n2=in.nextInt();

        add=n1+n2;
        System.out.println("Addition of "+ n1 +" and" +n2 + " = "+add);
        }
    } 
}
