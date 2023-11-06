package Day38_InterviewPractice;

public class Topic3_InterviewQuestions {
    public static void main(String[] args) {

    }
}

/*
 Can we declare abstract methods as static?
No, abstract methods can not be static.

Can we re-assign a value to a field of interfaces?
No. The fields of interfaces are static and final by default. They are just like constants. You can’t change their value once they got.

Can we declare an Interface with abstract keyword?
Yes, we can declare an interface with abstract keyword. But, there is no need to write like that. All interfaces in Java are abstract by default.

Can an interface extend a class?
No, an interface can’t extend a class. But it can extend another interface.

Can we declare constructors as final?
No, constructors can not be final.

JVM  <- bowl, cup
JRE  <- Ready-mix cake
JDK  <- Dr. Oetker


Explain exception handling mechanism in Java?
try, catch, finally, throw and throws

What is the difference between error and exception in Java?
Errors are mainly caused by the environment in which an application is running. For example, OutOfMemoryError happens when JVM runs out of memory. Whereas exceptions are mainly caused by the application itself. For example, NullPointerException occurs when an application tries to access null object.

try{
}
int year = 2022;
catch(){}
finally{}

No, It shows compilation error. The try block must be followed by either catch or finally block. You can remove either catch block or finally block but not both


try{
    int a = 5;
}
finally{

}

int year = 2022;


try{
    sout("1");
    statement; <- exception
    sout("2")
}catch(){

}
Once a try block throws an exception, remaining statements will not be executed. control comes directly to catch block.

what are checked and unchecked exceptions in java?

Checked exceptions are the exceptions which are known to compiler. Hence, the name checked exceptions. These exceptions are also called compile time exceptions. Because, these exceptions will be known during compile time.

Unchecked exceptions are those exceptions which are not at all known to compiler. These exceptions occur only at run time. These exceptions are also called as run time exceptions. All subclasses of java.lang.RunTimeException and java.lang.Error are unchecked exceptions.

Does finally block get executed If either try or catch blocks are returning the control?

Yes, finally block will always be executed no matter whether try or catch blocks are returning the control or not.

Can we throw an exception manually? If yes, how?

Yes, we can throw an exception manually using throw keyword. Syntax for throwing an exception manually is
throw new NumberFormatException();


What is the use of throws keyword in Java?
If a method is capable of throwing an exception that it could not handle, then it should specify that exception using throws keyword. It helps the callers of that method in handling that exception.


Are JavaScript and Java the same?
NO,

What is immutable ?
Everytime when you try to change it, it will create a new object.
It consumes more memory. To eliminate this problem, They created StringBuffer and StringBuilder.

StringBuffer and StringBuilder are mutable;
StringBuffer <- thread safe
StringBuilder <- not thread safe

Can ArrayList contains duplicate values?
YES

What is the difference between Array and ArrayList?
Array is fixed size
Arraylist is resizable.

Arraylist is improved version of Array.

MAP <- key and value

final vs finalize vs finally ?
final -> is a keyword. Used to apply restrictions
    final variable -> can't be changed
    final method   -> can't be overridden
    final class    -> can't be extended

finally -> is a block that we are using when we handle exceptions.
finalize -> is a method and it will be executed when an object is destroyed. (Garbage collector)



                       Mutable      Thread - Safe
String                    NO            YES
String Buffer             YES           YES
String Builder            YES           NO


Every class is extended from Object

class A extends Object{ }


int a = 5;
double d = (double) a;

Integer.parseInt("13")


String s = "Something"; <-- autoboxing
String s = new String("Something");

Integer i = 500;

int j = i; <- unboxing
int j = i.intValue();

 */

abstract interface A{
    final static int Number = 5;
}

class B implements A{
    void AMethod(){
//         Number = 7;  <- we can't do this
    }

     B(){

    }
}

class C{
    {
        //before constructor, everytime
    }

    static {
        //before constructor, only the first time
    }

    C(){
        // constructor, everytime
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}