import java.sql.Date;
import java.util.*;

class Time {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();

        Date start=new Date();

        for(int i=0;i<100000;i++)
            s=s.append("a");

        Date end=new Date();

        System.out.println("Processing time : "+(end.getTime()-start.getTime()+"ms"));
    }
}
