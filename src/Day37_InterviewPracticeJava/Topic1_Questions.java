package Day37_InterviewPracticeJava;

public class Topic1_Questions {
    public static void main(String[] args) {

    }
}

/*

What are the fundamental principles of object-oriented programming?
a) Inheritance
b) Abstraction
c) Polymorphism
d) Encapsulation


What do you mean by inheritance in Java?

Inheritance is one of the key principle of object-oriented programming. Through inheritance, one class can inherit the properties of another class. The class from which properties are inherited is called super class and the class to which properties are inherited is called subclass.

We are using implements and extends keyword.

Does Java support multiple inheritance? If not, why?

To avoid ambiguity, complexity and confusion, Java does not support multiple inheritance. i.e. a class in Java can not extend more than one classes.
For example, if Class C extends Class A and Class B which have a method with same name, then Class C will have two methods with same name. This causes ambiguity and confusion for which method to use. To avoid this, Java does not supports multiple inheritance.

How do you restrict a member of a class from inheriting to its subclasses?
Encapsulation : public, private, protected, default

By declaring that member as a private. Because, private members are not inherited to subclasses.


Can a class extend itself?

class A extends A{

}

No, a class can not extend itself.

What happens if both, super class and subclass, have a field with same name?

Super class field will be hidden in the subclass. You can access hidden super class field in subclass using super keyword.


class A{
    String Name;   <- #1
}

class B extends A{
    String Name;    <- #2

    void AMethod(){
        sout(Name); this will print #2
        sout(super.Name); this will print #1
    }
}

What is the difference between super() and this()?

super       <-- refer to super class.      super.Field;   super.YourMethod();
this        <-- refer to same class.
super()     <-- It is refer to super class constructor.
this()      <-- It is refer to same class constructor.

Do constructors have return type?
No, constructors in Java don’t have return type.

 What happens if you keep return type for a constructor?
If you keep return type for a constructor, it will be treated as a normal method and also compiler gives a warning saying that method has a constructor name.

What is no-arg constructor?
Constructor without arguments(parameters) is called no-arg constructor. Default constructor in Java is always a no-arg constructor.


Can I overload a constructor?
YES.

What is the limit for overloading? (how many constructor I can create?)
Sky is the limit!

What is the difference between constructor and method?

Constructor is a special member of a class which is used to create the objects to the class. It is special because it will have same name as class. It will have no return type.

Method is ordinary member of a class which is used to implement some behavior of a class. It will have its own name and return type.

What are the differences between static and non-static methods?

Static method is common to all instances of a class.
Static methods are stored in the class memory. Whereas non-static methods are stored in the object memory. Each instance of a class will have their own copy of non-static methods.

Can we declare main() method as private?

No, main() method must be public. You can’t define main() method as private or protected or with no access modifier. This is because to make the main() method accessible to JVM.

Can we declare main() method as non-static?
No, main() method must be declared as static so that JVM can call main() method without instantiating it’s class.

Can we change the return type of main() method?
No, the return type of main() method must be void only.


Can we change the String[] in main() method?
NO.

How many types of modifiers are there in Java?

Two types of modifiers are there in Java. They are,
Access Modifiers   <- public private protected and default
Non-access Modifiers  <- final, static, abstract and synchronized.

final method   <- you can not override
final field    <- you can not change the value
final class    <- you can not extend it

abstract class
void amethod();  <- abstract method, without body

 synchronized : It is used to achieve thread safeness. Only one thread can execute a method or a block which is declared as synchronized at any given time.


thread   <- starbucks
thread safety <- ticketmaster

Can a method or a class be final and abstract at the same time?
No, it is not possible. A class or a method can not be final and abstract at the same time. final and abstract are totally opposite in nature. final class or final method must not be modified further whereas abstract class or abstract method must be modified further.

Can we declare an abstract method as private?
No, abstract methods can not be private. They must be public or protected or default so that they can be modified further.

What is polymorphism in Java?

Polymorphism refers to any entity whether it is a method or a constructor or an operator which takes many forms or can be used for multiple tasks.

How we are achieving polymorphism?

1- Method Overloading
2- Method Overriding


What is method overloading in Java?

SAME METHOD NAME and DIFFERENT PARAMETER SIGNATURE

Can we declare one overloaded method as static and another one as non-static?
Yes. Overloaded methods can be either static or non-static.

public static void MyMethod(int a)          < int
public void MyMethod(double b)              < double
private void MyMethod(int a, int b)         < int, int
public final double MyMethod(String a)      < String
protected static String MyMethod(int MyInteger)  < int   X We can't write this



OVERRIDE
SAME NAME SAME PARAMETER SAME RETURN TYPE

We can't override static methods
We can't override private methods
We can't override final methods


Can an overloaded method be overridden?
Yes, we can override a method which is overloaded in super class.



Do I have to have inheritance in place for method overload?
NO


Do I have to have inheritance in place for method override?
YES


Abstract class must have only abstract methods. True or false?

False. Abstract methods can also have concrete methods.

Can interfaces have constructors?

No. Interfaces can’t have constructors;


Interface <- skeleton
Abstract Class <- skeleton with some meat on it

Can an interface extend a class?
No, an interface can’t extend a class. But it can extend another interface.


 */

class A {

    public A(){
        System.out.println("Super Class Constructor");
    }

    public static void MyMethod(int a){

    }
    public void MyMethod(double b){

    }
    private void MyMethod(int a, int b){

    }
    private final double MyMethod(String a){
        return 0;
    }
//    protected static String MyMethod(int MyInteger){   <- we can't because parameter signature is same with the first one
//        return "";
//    }
}

class B extends A{
    public B(){
        super();
        System.out.println("This line will be printed after super class' constructor");
    }

    @Override
    public void MyMethod(double b) {
        super.MyMethod(b);
    }
}