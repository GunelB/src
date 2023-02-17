package Day27_Abstraction;

public class Topic2_HA_AbstractClasses {
    public static void main(String[] args) {
        // I can't create an instance of an Interface
//        AnInterface a = new AnInterface();

        // I can't create an instance of an abstract class
//        Bakery b = new Bakery();
    }
}

// Can I make an abstract class final, Why?
// NO, we need to extend an abstract class to able to use it. final keyword will prevent to extend it.
abstract class Bakery {
    String AField;

    // We can define a private field in abstract class
    private String APrivateField;

    // we can define a protected field in abstract class
    protected String AProtectedField;

    public Bakery(){
        // this is your constructor.
        // We can create a constructor for Abstract Class
    }

    // We can create a regular method in abstract class
    public void AMethod (){

    }

    //Can I create an abstract method in non-abstract class?
    // NO
    abstract void AnAbstractMethod();
}

interface AnInterface{

    String AField = "Something";

    // We can not define a private field in interface
    // private String APrivateField = "something";

    // we can not define a protected field in interface
//    protected String AProtectedField = "something";

    // Everything in the interface should be public and it is public by default

    // I can't have a constructor
    // public AnInterface ();

    // Interfaces can not have a regular method (with body)
    /*
    public void AMethod(){

    }
     */
    // we can create an abstract method in interface
    // The abstract keyword is redundant in below
    abstract void AnAbstractMethod();
}

class Baklava extends Bakery {
    @Override
    void AnAbstractMethod() {

    }
}

/*
    Abstraction can be achieved with either abstract classes or interfaces.
    Abstraction is the process of separating ideas from their action.
    Interfaces are like skeletons. If you want to build a human, you should use that skeleton.
    Abstract classes are like skeletons, but with some meat on them as well.
    It's just there to make your work easier.
    You can consider an abstract class to be an interface. which already has some implementation.

    You do abstraction when deciding what to implement.

    Interfaces simply create a kind of structure for you classes to denote that your class should have a
    defined and agree-upon structure.
    For example, all animals eat and make sounds. Thus you can have an interface,
    called IAnimal which only mentions that classes should Eat, and MakeSound.

    // what is difference between abstract class and abstract method
    Abstract class: is a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class).
    Abstract method: can only be used in an abstract class, and it does not have a body.
     The body is provided by the subclass (inherited from).
     An abstract class can have both abstract and regular methods.
 */


// Can we declare an interface with "abstract" keyword?
//Yes we can, but there is no need because all interfaces in java abstract by default
abstract interface IAnimal{
    // Can interface have static methods?
    // if you have a body, yes.
    static void AMethod (){

    }
}