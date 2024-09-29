import java.util.*;


public class Userinput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter value of x: ");
            int x=in.nextInt();
            
            System.out.println("Value of x is : "+x);
        }
    }
}



