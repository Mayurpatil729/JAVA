public class Operators16 {
    public static void main(String[] args) {
        //Assignment Operators

        // 1. Simple
        int x=10;
        System.out.println(x);

        // 2. Chained
        int a,b,c,d;
        // int a=b=c=d=20;  // CE.error
        a=b=c=d=20;
        
        System.out.println(a);
        System.out.println(a+"..."+b+"..."+c+"..."+d);

        // 3. Compound
        int z=20;
        z+=10;
        System.out.println(z);

        // There are total 11 compound operators.
        int A,B,C,D;
        A=B=C=D=20;
        A+=B-=C*=D/=2;
        System.out.println(A+"..."+B+"..."+C+"..."+D);


        //Conditional Operators(?:) or Ternary Operators
        // a++,++a === Unary
        // a+b === Binary

        int y=(10<20)?30:40;
        System.out.println(y);

        int w=(10>20)?30:((40>50)?60:70);
        System.out.println(w);


        //new operator
        //1. We can use "new" operator to create an object.
        //2.There is no "delete" operator in java because destruction of useless objects is the 
        //responsibility of garbage collector
        
    }
}
