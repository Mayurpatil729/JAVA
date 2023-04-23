import java.util.*;

public class Userinput1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the String : "); 
        System.out.println("Entered String by next method : "+in.next());
        System.out.println("Entered String by nextLine Method : "+in.nextLine());
        in.close();
    }
}





