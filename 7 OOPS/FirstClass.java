// class <Class_name>
// {
// Fields;
// Constructors();
// Methods();
// }

import java.util.*;
class Employee
{
    //fields declaration
    private int emp_no;
    private String name;
    private double salary;
    //methods declaration
    public void getData()
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter emp_number ");
        emp_no=in.nextInt();
        System.out.println("Enter emp_name ");
        name=in.next();
        System.out.println("Enter emp_salary ");
        salary = in.nextDouble();
        in.close();
        }
        public void putData()
        {
        System.out.println("Emp_no="+emp_no);
        System.out.println("Emp_Name="+name);
        System.out.println("Emp_Salary="+salary);
        System.out.println("------------------------------------------");
        }
        public static void main(String [] args)
        {       
        //creating two objects of Employee class
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter first employee details");
        e1.getData();
        System.out.println("Enter second employee details");
        System.out.println("\nFirst employee is ");
        e1.putData();
        System.out.println("Second employee is ");
        e2.putData();
        e2.getData();
}
}



