package PACKAGE.Pac1;

import java.util.*;
public class Sub
{
    public static void main(String[] args){
        try(Scanner in =new Scanner(System.in)){
        
        int n1, n2,sub;
        System.out.println("Enter The Two numbers for addition : ");
        n1=in.nextInt();
        n2=in.nextInt();

        sub=n1+n2;
        System.out.println("Substraction of "+ n1 +" and" +n2 + " = "+sub);
        }
    } 
}










