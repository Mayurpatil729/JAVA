import java.util.*;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        //objects must be implements comparable interface and homogenous 
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("N"));
        System.out.println(t);


        // System.out.println("A".compareTo("Z")); //-ve
        // System.out.println("Z".compareTo("K"));  //+ve
        // System.out.println("A".compareTo("A"));  //0
        // System.out.println("A".compareTo(null)); //RE: NPE
    }
}



