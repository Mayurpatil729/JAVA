public class Operators15 {
    public static void main(String[] args) {
        //Explicit Type Casting.
        // Programmer
        //bigger--> smaller. Narrowing or downcasting
        //Loss of information.

        int x=130;
        // byte b=x;
        byte b=(byte)x;
        System.out.println(b);
        //-126

        double d=130.456;
        int x=(int)d;
        System.out.println(x);
        //130

        byte b=(byte)d;
        System.out.println(b);
        //-126



    }
    
}
