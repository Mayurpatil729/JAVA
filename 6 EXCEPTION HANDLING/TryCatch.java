// public class TryCatch {
//     public static void main(String[] args) {
//         System.out.println("Statement 1");
//         try {
//             System.out.println(10/0);
//         } catch (ArithmeticException e) {
//             System.out.println(10/2);
//         }
//         System.out.println("Statement 3");
//     }
// }


public class TryCatch {
    public static void main(String[] args) {
         try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            // System.out.println(10/0);
            System.out.println("Statement 3");

         } catch (ArithmeticException e) {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}


// case 1 : Normal termination
// case 2 : statement 2 EXCEPTION
// case 3 : catch doesn't match
// case 3 : exception 4 and 5


