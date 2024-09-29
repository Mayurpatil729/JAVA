 
## Polymorphism
Definition: One action, multiple forms. It allows methods to perform differently based on the object calling them.

Compile-time Polymorphism (Method Overloading): Same method name, different parameters.
Runtime Polymorphism (Method Overriding): Child class provides a specific implementation of a method already defined in the parent class.
--------------------------------------------------------------------------
// Method Overloading

-----------------------------------------------------
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(5, 10)); // Output: 15
//         System.out.println(calc.add(5, 10, 20)); // Output: 35
//     }
// }

-----------------------------------------------------------

//  Method Overriding
--------------------------------------------------------


class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
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






















