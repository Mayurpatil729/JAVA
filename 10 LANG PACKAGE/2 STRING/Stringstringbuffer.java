
class Stringstringbuffer {
    public static void main(String[] args) {
        // String : 
        // String is immutable , once the object created then the changes 
        // in existing object is not possible, the another object with changes is created
        String s1 = new String("HelloWorld");
        String s2 = s1.concat("Java");
        System.out.println(s2);

        // String Buffer :
        // String Buffer is mutable , once the object created then the changes 
        // in existing object is possible.
        StringBuffer sb = new StringBuffer("HelloWorld");
        sb.append("Java");
        System.out.println(sb);
    }
}
