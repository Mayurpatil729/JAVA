public class Operators10 {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);

        // System.out.println(t instanceof String);

        System.out.println("****************************************************");

        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Object);
        System.out.println(null instanceof Runnable);
    
    }
}

// Thread is child of object class and uses Runnable interface class
// There must be some relation between r and x.














