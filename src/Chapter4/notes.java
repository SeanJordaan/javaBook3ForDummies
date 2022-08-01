/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

/**
 *
 * @author Sean
 */
public class notes {/*
    
    Introducing Inheritance

    The word inheritance conjures up several noncomputer meanings:
    A class that’s based on another class is said to inherit the other class.
    A derived class automatically takes on all the behavior and attributes of its base class
    A derived class can add features to the base class it inherits by defining its own methods and fields.
    A derived class can also change the behavior provided by the base class
    Inheritance is best used to implement is-a-type-of relationships
    
   
    
    
    Inheritance hierarchies
    
    One of the most important aspects of inheritance is that a class derived from a 
    base class can in turn be used as the base class for another derived class
    All classes ultimately derive from a Java class named Object
    
    

    
    Creating Subclasses
    
    The basic procedure for creating a subclass is simple: You just use the extends
    keyword on the declaration for the subclass
    public class ClassName extends BaseClass
{
 // class body goes here
}
    public class BouncingBall extends Ball bouncing ball comes from the ball class
    A subclass inherits all the members from its base class
    You can’t access from the subclass methods or fields that are declared in the base class as private.
    

    
    Overriding Methods
  
    If a subclass declares a method that has the same signature as a public method of 
    the base class, the subclass then over rides the base class 
    The class must extend the class that defines the method you want to override
    You can’t override a private method. It must be public
    The name of the method and the parameter types must be the same.
    

    
    Protecting Your Members
    
    Java provides a third visibility option that’s useful when you create subclasses:protected. other than public and private 
    public class Ball
{
 private double weight;
 protected double getWeight()
 {
 return this.weight;
 }
 protected void setWeight(double weight)
 {
 this.weight = weight;
 }
}
public class BaseBall extends Ball
{
 public BaseBall()
 {
 setWeight(5.125);
 }
}
Here, the getWeight and setWeight methods are declared with protected access, 
which means that they’re visible in the subclass BaseBall. These methods aren’t 
visible to classes that don’t extend Ball, however.
    
    
    
    
    
    
    Using this and super in Your Subclasses
    
    It works similarly to this but refers to the instance of the base class rather than the instance of the current class
    
    
    
    Understanding Inheritance and Constructors
    
    When you create an instance of a subclass, Java automatically calls the default 
    constructor of the base class before it executes the subclass constructor.
    If you use super to call the superclass constructor, you must do so in the very first statement in the constructor
    If you don’t explicitly call super, the compiler inserts a call to the default 
    constructor of the base class.and if the bas class doesnt have a constructer then java will not compile the program.
    
    
    
    Final methods
    
    A final method is a method that can’t be overridden by a subclass. To create a final 
    method, you simply add the keyword final to the method declaration
    Private methods are automatically considered to be final because you can’t 
    override a method you can’t see.
    
    
    
    Final classes
    
    A final class is a class that can’t be used as a base class. To declare a class as final, 
    just add the final keyword to the class declaration
    When you declare a class to be final, all of its methods are considered to be final 
    as well.
    
    
    
    Casting Up and Down
    
    An object of a derived type can be treated as though it were an object of its base type.
    This arrangement is called upcasting
    
    
    
    
     Tracing the Throwable hierarchy
     
     Throwable: The root of the exception hierarchy is the Throwable class. 
     This class represents any object that can be thrown with a throw statement and 
     caught with a catch clause.
     Error: This subclass of Throwable represents serious error conditions that 
     reasonable programs can’t recover from.
     RuntimeException: This subclass of Exception represents unchecked 
     exceptions.
    
    
    Creating an exception class
    
    To create a custom exception class, you just define a class that extends one of the 
classes in the Java exception hierarchy
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
    
}
