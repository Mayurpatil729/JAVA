//Constructor Overloading

class Test1{
    Test1(double d)
    {
        this(10);
        System.out.println("Double - arg constructor ");
    }

    Test1(int i){
        this();
        System.out.println("Int - arg constructor ");
    }

    Test1()
    {
        System.out.println("no-arg constructor");
    }
    public static void main(String[] args) {
        Test1 t1=new Test1(10.5);
        // Test1 t2=new Test1(10);
        // Test1 t2=new Test1();
    }
}





























