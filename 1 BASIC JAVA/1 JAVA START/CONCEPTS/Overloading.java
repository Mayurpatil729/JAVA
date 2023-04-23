public class Overloading {
    public static void main(String[] args) {
        System.out.println("String []");
    }
    
    public static void main(int[] args) {
        System.out.println("int []");
    }
}

//overloading of main method is possible but jvm is always called String[] args
// and main method only the other overloaded method we have to explicitly like normal
// method call.
