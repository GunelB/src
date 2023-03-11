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