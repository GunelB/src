package Day27_Abstraction;

public class Topic1_GB_Interface {
    public static void main(String[] args) {
        Cat MyCat = new Cat();
        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

    }
}
interface AquaticAnimals{
    void Swim();
}
 //Animals living on the land
interface TerrestrialAnimals{
    void Walk();
}
class Cat implements TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Cat's walking");
    }
}
interface FarmAnimals extends TerrestrialAnimals{

}
class Dolphin implements AquaticAnimals {
    @Override
    public void Swim() {
        System.out.println("Dolphin is swimming");


        }
}

class Lion extends Cat{
    @Override
    public void Walk() {
        super.Walk();
    }
}
