import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int year=in.nextInt();

        if(year%4==0 && year%100==0)
        {
            System.out.println("Given year is the Leap year");

        }
        else
            System.out.println("Given year is not the Leap year");
    } 
}



