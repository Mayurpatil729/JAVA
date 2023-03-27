import java.util.Scanner;
import java.math.BigInteger;

class BigFactorial
{
 public static void main(String args[])
    {
        int n, c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        input.close();

        for (c = 1; c <= n; c++) {
        fact = fact.multiply(inc);
        inc = inc.add(BigInteger.ONE);
         }
        System.out.println(n + "! = " + fact);
    }
}



// import java.util.*;

// class BigFactorial{
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
        
//         System.out.println("Program to find Big Factorial of number : ");
//         System.out.println("Enter the number to find factorial of number : ");
        
//         long n=in.nextInt();
//         long i,fact=1;
//         in.close();
        
//         for(i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println("Factorial of "+n+" = "+fact);
//     }
// }





































