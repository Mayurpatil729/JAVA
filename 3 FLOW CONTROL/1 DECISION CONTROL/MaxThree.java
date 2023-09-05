import java.util.*;
// import java.lang.*;

class MaxThree {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        if(x>y)
        {
            if(x>z)
                System.out.println(x+" is greater number");
            else
                System.out.println(z+" is greater number ");
        }
        else
        {
            if(y>z)
                System.out.println(y+" is greater number ");
            else
                System.out.println(z+" is greater number ");
        }
        in.close();
    }
}



