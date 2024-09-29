
public class Operatorequals {
    public static void main(String[] args) {

        // String
        String s1 = new String("Mayur");
        String s2 = new String("Mayur");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        // String Buffer
        StringBuffer sb1 = new StringBuffer("Mayur");
        StringBuffer sb2 = new StringBuffer("Mayur");
        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        /*
         * == : Reference comparision
         * equals : Also reference comparision , but overriden in String class and do
         * the content comparision.
         */
    }

}
