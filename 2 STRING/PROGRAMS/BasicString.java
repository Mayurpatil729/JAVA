// import java.util.*;
import java.lang.String;

class BasicString {
    public static void main(String[] args){

        String s1 = "James potter";
        String s2="Harry James Potter";
        String s3= "James";
        String s4="lily";

        System.out.println();
        System.out.println(s1);
        char ch=s1.charAt(3);

        System.out.println();
        System.out.println("\nString Methods : ");
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println("ch= "+ch);
        System.out.println(s2.indexOf("james"));
        System.out.println(s2.lastIndexOf("e"));

        System.out.println();
        System.out.println((s1.equals(s2)));
        System.out.println((s1.equals(s3)));
        System.out.println((s1.equalsIgnoreCase(s3)));

        System.out.println();
        System.out.println(s4.compareTo(s1));
        System.out.println(s1.endsWith("potter"));
        System.out.println(s1.startsWith("James"));


        System.out.println();
        String l=s1.toLowerCase();
        System.out.println(l);
        String u=s1.toUpperCase();
        System.out.println(u);
        String t="   Artist   ";
        System.out.println(t.trim());

        System.out.println();
        String s="earth planet";
        String p=s.substring(6);
        String p1=s.substring(6,8);
        System.out.println(p);
        System.out.println(p1);
        
    }
}














