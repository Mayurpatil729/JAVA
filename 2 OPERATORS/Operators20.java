public class Operators20 {
    public static void main(String[] args) {
        
    }
}
// Difference between NoClassDefFoundError vs ClassNotFoundException
 
// For hard coded class names at Runtime in the corresponding .class files not 
// available we will get NoClassDefFoundError , which is unchecked
// Test t = new Test( );
// In Runtime Test.class file is not available then we will get 
// NoClassDefFoundError


// For Dynamically provided class names at Runtime , If the corresponding .class 
// files is not available then we will get the RuntimeException saying 
// ClassNotFoundException
// Ex : Object o=Class.forname("Test").newInstance( ); 
// At Runtime if Test.class file not available then we will get the 
// ClassNotFoundException , which is checked exception 



