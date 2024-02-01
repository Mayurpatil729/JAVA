abstract class Vehicle{
    public static void main(String[] args) {
       
    }

    public abstract int getNoOfWheels();
}

class Bus extends Vehicle
{
    public int getNoOfWheels(){
        return 7;
    }
}

class Auto extends Vehicle
{
    public int getNoOfWheels()
    {
        return 3;
    }
}




