import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo2 {
    public static void main(String[] args) {
// We can serialize any no of objects to the file but in which order we serialized in the 
// same order only we have to deserialize.

        Dog d1=new Dog();
        Cat c1=new Cat();
        Rat r1=new Rat();

        //Serialization
        FileOutputStream fos=new FileOutputStream("abcd.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        //Deserialization
        FileInputStream fis =new FileInputStream("abcd.ser");
        ObjectOutputStream ois =new ObjectOutputStream(fis);
        Dog d2=(Dog)ois.readObject();
        Cat c2=(Cat)ois.readObject();
        Rat r2=(Rat)ois.readObject();
    }
}


// If we don't know order of objects :d
// FileInputStream fis=new FileInputStream("abcd.ser");
// ObjectInputStream ois=new ObjectInputStream(fis);
// Object o=ois.readObject();

//     if(o instanceof Dog){
//         Dog d2=(Dog)o;
//         //perform Dog specific functionality
//     }
//     if(o instanceof Cat){
//         Cat c2=(Cat)o;
//         //perform Cat specific functionality
//     }
//     if(o instanceof Rat){
//         Rat r2=(Rat)o;
//         //perform Rat specific functionality
//     }



