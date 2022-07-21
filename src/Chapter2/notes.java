/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class notes {
    /* 
    
    Declaring a Class
    
    All classes must be defined by a class declaration — lines of code that provide the 
    name for the class and the body of the class
    
    
    
    
    Picking class names
    
    Begin the class name with a capital letter
    Whenever possible, use nouns for your class names.
    Avoid using the name of a Java API class. Like Math or String 
    
    
    
    
    Knowing what goes in the class body
    
    Fields
    Methods
    Constructors
    Initializers
    Other classes and interfaces
    
    
    
    
    Seeing where classes go

    A public class must be written in a source file that has the same name as the class
    This next code wont compile
    public class DiceGame
{
 public static void main(String[] args)
 {
 Dice d = new Dice();
 d.roll();
 }
}
public class Dice
{
 public void roll()
 {
 // code that rolls the dice goes here
 }
}
    The compiler coughs up a message indicating that Dice is a public class and must 
    be declared in a file named Dice.java.
    An inner class is a class that’s defined within the body of another class and is available only from within that class    
    
   
    
    
    Working with Members
    
    The members of a class are the fields and methods defined in the class body.
    
    
    
    
    Understanding fields

    A field is a variable that’s defined in the body of a class, outside any of the class’s 
    methods
    Fields, which are also called class variables, are available to all the methods of a class
    If you don’t want the field to be visible outside the class, 
    use the private keyword instead.
   
    
    Understanding methods
    
    To declare a method that’s available to users of your class, add 
    the public keyword to the method declaration.
    To create a private method that can be used within the class but isn’t visible outside the class, 
    use the private keyword.
    
    
    
    Understanding visibility
    
    public or private = This is called the visibility of the field or method
    The combination of all the members that have public access is sometimes called 
    the public interface
    You can use private fields and methods within a class  — but not from other 
    classes
    
    
    
    Using Getters and Setters

     As a general rule, you should avoid 
     creating public fields. Instead, you can make all your fields private. Then you can 
     selectively grant access to the data those fields contain by adding to the class special methods called accessors.
    There are two types of accessors = getter and seter 
    getter gets the value of a class and setter sets the value of a class 
    
    
    
    Overloading Methods
    
    A Java class can contain two or more methods with the same name, provided that 
    those methods accept different parameters. This technique, called overloading
    PrintWriter is actually- void println()
                             void println(boolean x)
                             void println(char x)
                             void println(char[] x)
                             void println(double x)
                             void println(float x)
                             void println(int x)
                             void println(long x)
                             void println(Object x)
                             void println(String x)
    A method’s signature is the combination of its name and the 
    number and types of parameters it accepts.
    Two things that are not a part of a method’s signature are
    The method’s return type
    The names of the parameters
    
    
    
    
    Creating Constructors
    
    a constructor is a block of code that’s called when an instance of an object is 
    created
    A constructor doesn’t have a return type
    not considered to be members of a class
    ClassName must be the same as the name of the 
    class that contains the constructor
    
    
    
    
    Creating basic constructors
    
    Probably the most common reason for coding a constructor is to provide initial 
    values for class fields when you create the object
    public Actor(String first, String last)
{
 firstName = first;
 lastName = last;
}
    Actor a = new Actor("Arnold", "Schwarzenegger");

    
    
    
    Creating default constructors
    
    Java constructors are like that. Every class has a right to a constructor. If you 
    don’t provide a constructor, Java appoints one for you
    
    
    
    Calling other constructors
    
    A constructor can call another constructor of the same class by using the special 
    keyword this as a method call. 
    
    
    
    
    Finding More Uses for the this Keyword

    You can also use this in the body of a class constructor or method to refer to the current object
    You can print the current object to the console by 
    using the following statement:
    System.out.println(this);
    
    
    Using Initializers
    
    An initializer (sometimes called an initializer block) is a lonely block of code that’s 
    placed outside any method, constructor, or other block of code
    Initializer blocks are similar to variable initializers used to initialize variables. The 
    difference is that with an initializer block, you can code more than one statement
    If a class contains more than one initializer, the initializers are executed in the 
    order in which they appear in the program.
    Initializers are executed before any class constructors. 
    A special kind of initializer block called a static initializer lets you initialize static fields.
    Initializers are sometimes used with anonymous classes.
    
    
    
    
    */
}
