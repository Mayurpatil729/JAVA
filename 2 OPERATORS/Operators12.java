public class Operators12 {
    public static void main(String[] args) {
        //Short circuit (&&,||) Operators
        int x=10,y=15;
        if(++x<10 & ++y >15)
        if(++x<10 && ++y >15)
        if(++x<10 | ++y >15)
        if(++x<10 || ++y >15)
        {
            x++;
        }
        else
        {
            y++;
        }
    }
}
