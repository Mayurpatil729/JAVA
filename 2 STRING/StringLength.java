import java.util.*;
// import java.lang.*;

class StringLength{
    public static void main(String...args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=in.nextLine();
        in.close(); 
        
        System.out.println("Length : "+ s.length);
    }
}
