public class FinalizeDemo3 {
    static int count=0;
    public static void main(String[] args) 
    {
        for(int i=0;i<1000000;i++)
        {
            FinalizeDemo3 f=new FinalizeDemo3();
            f=null;
        }
    }
    
    public void finalize()
    {
        System.out.println("Finalize Method Called "+ ++count);
    }
}
