package Day17_Methods;

public class Topic2_GB_MethodsCont {
    public static void main(String[] args) {
   //  Food("Tomato","SeaSalt","Olive");
      PrintSum(7,9);
     return;
    }

    public static void Food(String Veggies,String Salt,String Oil){
        String VeggiesAndSalt = Veggies.concat(Salt);
        String VeggiesSaltAndOil=VeggiesAndSalt.concat(Oil);

        System.out.println("VeggiesSaltAndOil = " + VeggiesSaltAndOil);
    }
    public static int Sum(int num1,int num2){       //create a method public static returntypemethodName
        return num1+num2;
    }
}
