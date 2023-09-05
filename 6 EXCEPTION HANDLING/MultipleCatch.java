import java.io.FileNotFoundException;
import java.sql.SQLException;

// public class MultipleCatch {
//     public static void main(String[] args) {
        
   
//         try
//         {
//             // System.out.println(10/0);
//             // System.out.println(10/2);
//         }
        
//         catch(FileNotFoundException e)
//         {
//            System.out.println("Use local file");
//         }
//         catch(ArithmeticException e)
//         {
//            System.out.println("Perform these arithmetic exception");
//         }
//         catch(SQLException e)
//         {
//            System.out.println("Use oracle db,use mysqldb");
//         }
//         catch(Exception e)
//         {
//            System.out.println("Default Handler");
//         }
//    }  
// }



public class MultipleCatch {
        public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }
       
        catch(ArithmeticException e)
        {
           System.out.println("Perform these arithmetic exception");
        }
          catch(Exception e)
        {
           System.out.println("Exception Handler");
        }
       

    }       
}



// Highly recommended
// child --> parent



