public class Operators7 {
    public static void main(String[] args) {
        
        // System.out.println(10==20);
        // System.out.println('a'=='b');
        // System.out.println('a'==97.0);
        // System.out.println(false==false);

        // Thread t1=new Thread();
        // Thread t2=new Thread();
        // Thread t3=t1;
        // System.out.println(t1==t2);//false
        // System.out.println(t1==t3);//true

        Thread t=new Thread();
        Object o=new Object();
        String s=new String("Maur");
        System.out.println(t==o);           //false
        System.out.println(o==s);           //false
        
        // System.out.println(s==t);           //CE

    }
}
