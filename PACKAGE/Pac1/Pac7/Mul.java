package PACKAGE.Pac1.Pac7;
import java.util.*;

public class Mul{
    public static void main(String[] args){
        try(Scanner in =new Scanner(System.in)){
        
        int n1, n2,Mul;
        System.out.println("Enter The Two numbers for Multiplication: ");
        n1=in.nextInt();
        n2=in.nextInt();

        Mul=n1+n2;
        System.out.println("Multiplication of "+ n1 +" and" +n2 + " = "+Mul);
        }
    }
}
