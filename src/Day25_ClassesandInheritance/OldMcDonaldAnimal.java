package Day25_ClassesandInheritance;

public class OldMcDonaldAnimal {
    String Name;
    String Color;
    String Tag;
    int NumberOfLegs;

    final String FarmName = "Old McDonaldFarm";
    // What is difference between final, finally, finalize()

    public void Eat(){
        System.out.println(Name+" is eating!");
    }

    public void Sound (){
        System.out.println("Default Sound Method");
    }

    private void HiddenMethod(){

    }

    protected void SemiHiddenMethod(){

    }

    public final void FinalMethod(){

    }

}
