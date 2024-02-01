import java.io.*;

class Animal implements Serializable
{
    int i=10;
}

class Dog extends Animal
{
    int j=20;
}

class SerializeDemo7 
{
    public static void main(String[] args) throws Exception
    {
        Dog d=new Dog();
        System.out.println(d.i+"..."+d.j);
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        System.out.println(d1.i+"..."+d1.j);
    }
}
