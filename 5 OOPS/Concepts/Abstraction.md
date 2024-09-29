## Abstraction

Definition: Hiding the complex implementation details and showing only essential features to the user.

----------------------------------------------------------------------
abstract class Animal {
    abstract void makeSound();  // Abstract method, no body
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Bark
    }
}



