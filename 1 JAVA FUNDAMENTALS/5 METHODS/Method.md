Method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.

t is used to achieve the reusability of code.


Method Signature =Method name + parameterlist


There are two types of methods in Java:
1. Predefined Method
2. User-defined Method


1. Predefined Method
-----------------------------------------------
public class Demo   
{  
public static void main(String[] args)   
{  
// using the max() method of Math class  
System.out.print("The maximum number is: " + Math.max(9,7));  
}  
}  


2. User-defined Method
---------------------------------------
//user defined method  
public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}  


--------------------------------------------------------------------------

Static Method
A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method. We can also create a static method by using the keyword static before the method name.

The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.


--------------------------------------------------------------------------
Instance Method
The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class.




--------------------------------------------------------------------------

Abstract Method
The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must be abstract if it has abstract method. To create an abstract method, we use the keyword abstract.





--------------------------------------------------------------------------






























