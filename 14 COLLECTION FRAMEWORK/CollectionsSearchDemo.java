import java.util.*;

public class CollectionsSearchDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(Collections.binarySearch(l,"2"));
        System.out.println(Collections.binarySearch(l,"3"));
    }
}


