import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        
        l.add("Mayur");
        l.add("patil");
        l.add("Nikhil");
        l.add("om");

        System.out.println(l);
        ListIterator ltr=l.listIterator();

        while (ltr.hasNext()) 
        {
            String s=(String)ltr.next();
            if(s.equals("Mayur"))
            {
                ltr.remove();
            }
            else if(s.equals("om"))
            {
                ltr.add("rohan");
            }
            else if(s.equals("Nikhil"))
            {
                ltr.set("Mohan");
            }
            System.out.println(l);
        }
    }
}
