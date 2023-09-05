import java.util.*;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int TotalMarks=0,Percentage=0;
        System.out.println("Program to caculate percentage of Student : ");
        System.out.println("Enter the Marks of Physics : ");
        int s1=in.nextInt();
        System.out.println("Enter the Marks of Maths : ");
        int s2=in.nextInt();
        System.out.println("Enter the Marks of chemistry : ");
        int s3=in.nextInt();
        System.out.println("Enter the Marks of English : ");
        int s4=in.nextInt();
        System.out.println("Enter the Marks of biology : ");
        int s5=in.nextInt();

        TotalMarks=s1+s2+s3+s4+s5;
        Percentage=(TotalMarks/5);

        System.out.print("Percentage of Student : "+Percentage+"%");
        in.close();
    } 
}









