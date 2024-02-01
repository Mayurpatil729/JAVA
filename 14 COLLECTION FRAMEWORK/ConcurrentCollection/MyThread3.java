package ConcurrentCollection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread3 extends Thread {
    static CopyOnWriteArrayList l=new CopyOnWriteArrayList();
    public void run()
    {
        try{
        Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        
        System.out.println("Child Thread updating List : ");
        l.add("C");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        MyThread3 t=new MyThread3();
        t.start();
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            String s1=(String)itr.next();
            System.out.println("Main Thread iterating List and Current Object is : "+s1);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }
}




