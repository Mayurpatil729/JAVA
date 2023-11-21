
public class Operators4 {
    public static void main(String[] args) {
        // Arithmetic Operator
        // max(int,type of a,type of b)

        System.out.println('a' + 'b');
        System.out.println('a' + 1);
        System.out.println('a' + 1.2);

        // System.out.println(10/0);
        // //RE. AE:/ by zero

        // System.out.println(10/0.0);
        // System.out.println(-10/0.0);
        // //Infinity

        // System.out.println(0/0);
        // //RE. AE:/ by zero

        // System.out.println(0.0/0);
        // System.out.println(-0.0/0);
        // //NaN

        System.out.println(10<Float.NaN);//false
        System.out.println(10<=Float.NaN);//false
        System.out.println(10>Float.NaN);//false
        System.out.println(10>=Float.NaN);//false
        System.out.println(10==Float.NaN);//false

        System.out.println(10!=Float.NaN);//true
        System.out.println(Float.NaN!=Float.NaN);//true
    }
}
