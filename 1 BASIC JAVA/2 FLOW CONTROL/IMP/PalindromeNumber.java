import java.util.*;

class PalindromeNumber{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to check given number is palindrome number or not : ");
        int n=in.nextInt();
        System.out.println("");
        
        int back=n;
        int reverse=0;
        
        while(n>0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10; 
        }

        if (reverse==back)
        {
            System.out.println("Given number is palindrome number");
        }
        else
        {
            System.out.println("Given number is not palindrome number");
        }
        in.close();
    }
}


// class PalindromeNumber
// {       
//     public static void main(String args[])
//     {
//         String original, reverse = "";
//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter a string to check if it is a palindrome");
//         original = in.nextLine();
//         int length = original.length();

//         for ( int i = length - 1; i >= 0; i-- )
//         reverse = reverse + original.charAt(i);

//         if (original.equals(reverse))
//         System.out.println("Entered string is a palindrome.");
//         else
//         System.out.println("Entered string is not a palindrome.");
//     }
// }





// class PalindromeNumber
// {
//     public static void main(String args[])
//         {
//         String inputString;
//         Scanner in = new Scanner(System.in);
        
//         System.out.println("Input a string");
//         inputString = in.nextLine();
//         int length = inputString.length();
//         int i, begin, end, middle;
//         begin = 0;
//         end = length - 1;
//         middle = (begin + end)/2;
//         for (i = begin; i <= middle; i++) {
//         if (inputString.charAt(begin) == inputString.charAt(end)) {
//         begin++;
//         end--;
//         }
//         else 
//         {
//         break;
//         }
//     }

//     if (i == middle + 1)
//     {
//         System.out.println("Palindrome");
//     }
//     else
//     {
//         System.out.println("Not a palindrome");
//     }
//     in.close();
    
//     }
// }