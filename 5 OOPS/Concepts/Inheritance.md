
### Inheritance
Definition: One class (child) acquires properties and behaviors (methods) from another class (parent).

1. Single Inheritance: One child class inherits from one parent class.
2. Multilevel Inheritance: A child class inherits from another child class.
3. Hierarchical Inheritance: Multiple child classes inherit from one parent class.


-----------------------------------------------------------
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Output: Eating...
        myDog.bark();  // Output: Barking...
    }
}
