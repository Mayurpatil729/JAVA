import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) 
    {
        LinkedList l=new LinkedList();
        
        l.add("Mayur");
        l.add(729);
        l.add(null);
        l.add("Patil");
        l.set(0,"Software");
        System.out.println(l);
        l.add(0,"Nikhil");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("CCC");
        System.out.println(l);
    }
    
}
