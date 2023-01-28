package Day17_Methods;

public class Topic2_HA_MethodsCont {
    public static void main(String[] args) {
        // Write a method that makes food
        // The method should take 3 String parameters which is Veggies, Salt and Oil
        // You should concat them and print it.

        /*
        I need to create a method
        this method should take 3 String parameters and parameters names Veggies, Salt and Oil
        Return type void
         */

        Kitchen("Tomatoes","SeaSalt","OliveOil");

    }

    /// create a method
    /// 3 String parameters. Veggies, Salt and Oil
    /// No return, void
    /// MethodName Kitchen
    //public static ReturnType MethodName (Param1Type Param1Name, Param2Type Param2Name.......)

    public static void Kitchen (String Veggies, String Salt, String Oil){
        //You should concat them and print it.
        String Food = Veggies+Salt+Oil;

        String VeggieAndSalt = Veggies.concat(Salt);  //Veggies+Salt
        String VeggieSaltAndOil = VeggieAndSalt.concat(Oil);
        
        String Fancy = Veggies.concat(Salt).concat(Oil);

        System.out.println("Food = " + Food);
        System.out.println("VeggieSaltAndOil = " + VeggieSaltAndOil);
        System.out.println("Fancy = " + Fancy);
    }

    //Write a method that sum 2 numbers

    /*
    Create a method
    Parameters <- 2 int parameters
    Return Type <- int
    public static ReturnType MethodName (param1Type Param1Name, .......)
     */

    public static int SumTwo (int Number1, int Number2){
//        int Sum = Number1 + Number2;
//        return Sum;

        return Number1 + Number2;
    }



}
