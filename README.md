# JAVA_TAP
“Practice this Java concept.”
" short note "
Key concepts of OOPS in Java.
class
object
encapsulation
inheritance
polymorphism
abstraction

Class and Object

Class
A class is a blueprint for creating objects. it defines the structure and behavior of objects.

Ex :     class Car{  
String color;
int speed;
void drive(){
System.out.println("Car is Driving");
}
}

Object
An object is an instance of a class. it represents a real-world entity and has attributes and behaviors.

Ex:  Car mycar = new Car();
mycar.color = 'red';
mycar.drives();


Encapsulation

Encapsulation is the practice of bundling data(fields) and methods (function) that operate on the data  into a single unit (class). it also involves restricting direct access to some components using access modifiers(ex, private, protected)

class Employee{
private String name;
private int salary;

public String getName(){
retrun name;
}
public void setName(String name ){
this.name=name;
}
}

Inheritance
Inheritance allows a class to acquire properties and methods of another class. it supports code reusability.

class Animal{
void eat(){
System.out.println("this animal eats food.");
}
}
class Dog extends Animal{
void bark() {
System.out.println("Dog barks.");
}
}

Single , Multilevel, Hierarchical

** JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE

Polymorphism

polymorphism allows methods to perform differrent task based on the object that calls them.

it can be achieved :
Runtime Polymorphism(Method Overriding)
Compile-time Polymorphism(Method Overloading)

Abstraction:
is focuses on showing only essential details while hiding the implementation. it is achieved through abstract classes and interfaces.

Abstract Class:
delared using the abstract keyword.
can include both abstarct methods(methods without a body) and concrete methods (methods with a body).
cannot be instantiated directly
acts as ablueprint for subclasses, which must implement the abstract methods.


Interface:
Class --> Blueprint for object.
Interface --> Blueprint for class.

By Interface , we acheive abstraction and multiple inheritance.
int can have abstract methods, static constants, static methods and default methods.

Static Methods in Interface:
Used for utility operations that are RELATED to the interface but don't need instance state.
cannot be overridden by implementing classes
Called directly on the interface(not througth instance)

Default Methods in Interface
Provide optional functionality to implementing classes
Can be overrideen if needed
Can use other interface methods
Called througth instance.

Interface VS Abstract Class












                









