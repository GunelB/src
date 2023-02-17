package Day27_Abstraction;

public class Topic1_HA_Interface {
    public static void main(String[] args) {
        Cat MyCat = new Cat();
        MyCat.Walk();

        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

//        AquaticAnimals AA = new AquaticAnimals();
        /*
        You can not create an instance of interface because interface classes don't have a constructor
         */

        AquaticAnimals MySecondDolphin = new Dolphin();
        MySecondDolphin.Swim();





    }
}

// The animals which live in water. Examples : Octopus, Fish, Shark
interface AquaticAnimals {
    void Swim(); //This is an ABSTRACT method   <- in default it is public
}

// The animals which live in land. Examples : Lion, Cow, Deer
interface TerrestrialAnimal {
    void Walk();  //This is an ABSTRACT method  -Abstract method can not be private!
}

class Cat implements TerrestrialAnimal {
    @Override
    public void Walk() {
        System.out.println("Cat is walking");
    }
}

// what is difference between extends and implements keyword.
class Lion extends Cat {
    @Override
    public void Walk() {
        System.out.println("Lion is walking");
    }
}

interface FarmAnimals extends TerrestrialAnimal{

}

class Dolphin implements AquaticAnimals {
    @Override
    public void Swim() {
        System.out.println("Dolphin is swimming");
    }
}

// We can implement more than one interfaces
class Penguin implements AquaticAnimals, TerrestrialAnimal{
    @Override
    public void Swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void Walk() {
        System.out.println("Penguin is walking");
    }
}

// We can extends multiple interfaces
interface All extends AquaticAnimals, TerrestrialAnimal {

}

//Class cannot extend multiple classes
/* Below class definition is not true
class Tiger extends Lion, Cat {

}

 */