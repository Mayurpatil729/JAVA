import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        //System.out.println(q.peek());//null
        //System.out.println(q.element());//RE:NSEE

        for(int i=0;i<=10;i++)
        {
            q.offer(i);
        }

        System.out.println(q);//[0,1,2,...10]
        System.out.println(q.poll());//0
        System.out.println(q); //[1,2,3...,10]
    }
}
