public class FinalizeDemo2 {
    static FinalizeDemo2 s;

    public static void main(String[] args) throws Exception {
        FinalizeDemo2 f = new FinalizeDemo2();
        System.out.println(f.hashCode());
        // f=null;
        System.gc();

        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s = null;

        System.gc();
        Thread.sleep(5000);
        System.out.println("End of Main Method");

    }

    public void finalize() {
        System.out.println("Finalize Method Called");
        s = this;
    }
}
