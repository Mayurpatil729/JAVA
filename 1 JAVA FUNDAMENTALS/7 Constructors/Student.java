class Student
{
    String name;
    int rollno;

    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args)
    {
        Student s1=new Student("Mayur",101);
        Student s2=new Student("Ravi",102);

        System.out.println(s1.name+"....."+s1.rollno);
        System.out.println(s2.name+"....."+s2.rollno);
    }
}


// new keyword is used to create the object
// Constructor is specially design to perform the initialization of the object.


















