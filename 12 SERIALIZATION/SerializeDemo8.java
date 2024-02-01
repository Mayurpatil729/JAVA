import java.io.*;


class Animal
{
    int i=10;
    Animal()
    {
        System.out.println("Animal Constructor called ");
    }
}

class Dog extends Animal implements Serializable
{
    int j=20;
    Dog() 
    {
        System.out.println("Dog Constructor called ");
    }
}

class SerializeDemo8 {
    public static void main(String[] args) throws Exception
    {
        
        Dog d1=new Dog();
        d1.i=888;
        d1.j=999;

        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Deserialization Started.....");

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+"........"+d2.j);
    }
}















