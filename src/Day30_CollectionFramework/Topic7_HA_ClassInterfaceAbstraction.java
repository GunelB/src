package Day30_CollectionFramework;


public class Topic7_HA_ClassInterfaceAbstraction {
    public static void main(String[] args) {
        Car MyTesla = new Tesla();

        MyTesla.Acceleration();


    }
}


// interface
// abstract class

abstract class MyClass{

}

interface Car{
    void Acceleration(); // This is an ABSTRACT method

}

class Tesla implements Car {
    @Override
    public void Acceleration() {

    }
}

// API <- Application Programming Interface



//Access Modifiers
// public, private, protected and default

