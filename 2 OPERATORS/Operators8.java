public class Operators8 {
    public static void main(String[] args) {
        
        String s1=new String("Mayur");
        String s2=new String("Mayur");

        System.out.println(s1==s2);         //Reference Comparision
        System.out.println(s1.equals(s2));  //Content Comparision

        System.out.println("*********************************************************");
        System.out.println();
        
        String x=new String("Mayur");
        System.out.println(x==null);

        String y=null;
        System.out.println(y==null);

        System.out.println(null==null);
    }
    
}
