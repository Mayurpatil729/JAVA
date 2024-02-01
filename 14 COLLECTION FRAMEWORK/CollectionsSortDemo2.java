import java.util.*;

public class CollectionsSortDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        // l.add(new Integer(10)); //--CCE
        // l.add(null);//---NPE
        System.out.println("Before Sorting : " + l);
        Collections.sort(l,new MyComparator());
        System.out.println("After Sorting : " + l);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=(String)obj1;
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}


