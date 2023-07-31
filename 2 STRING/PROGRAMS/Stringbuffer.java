// import java.StringBuffer;
class Stringbuffer {
    public static void main(String[] args) {

        //append
        StringBuffer s1 = new StringBuffer("HelloWorld");
        s1.append("Java");
        System.out.println(s1);

        //insert
        StringBuffer s2 = new StringBuffer("HelloWorld");
        s2.insert(5, "Java");
        System.out.println(s2);

        //delete
        StringBuffer s3 = new StringBuffer("HelloWorld");
        s3.delete(5,9);
        System.out.println(s3);

        //deleteCharAt
        StringBuffer s4 = new StringBuffer("HelloWorld");
        s4.deleteCharAt(4);
        System.out.println(s4);

        //replace
        StringBuffer s5 = new StringBuffer("HelloWorld");
        s5.replace(5,9,"Java");
        System.out.println(s5);

        //reverse
        StringBuffer s6 = new StringBuffer("HelloWorld");
        s6.reverse();
        System.out.println(s6);
    }
}




