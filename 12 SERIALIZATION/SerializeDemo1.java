
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Dog implements Serializable {
    //Declarations
    //1
    int i=10;
    int j=20;

    // transient
    // transient int i=10;
    // int j=20;

    // transient static
    // transient static int i=10;
    // transient int j=20;

    //transient final
    // transient int i=10;
    // transient final int j=20;

    //transient final,static
    // transient static int i=10;
    // transient final int j=20;
}

public class SerializeDemo1 {
    public static void main(String[] args) throws Exception
    {
        Dog d1=new Dog();

        //Serialization
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        //De-Serialization
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();

        System.out.println(d2.i+"...."+d2.j);
    }
}
