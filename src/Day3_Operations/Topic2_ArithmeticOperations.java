package Day3_Operations;

public class Topic2_ArithmeticOperations {
    public static void main(String[] args) {
        // Addition (+) it is used when we add numbers

        // Num1 and Num2
        // Type VariableName = Value;
        int Num1 = 11;
        int Num2 = 25;

        int Total = Num1 + Num2;
        System.out.println("Total = " + Total);

        // create a double variable, Name it DoubleNumber1 and assign a double value
        // Type VariableName = Value;
        double DoubleNumber1 = 76.987456;

        // 76.987456 + 11 = 87.987456;
         double TotalNumber = DoubleNumber1 + Num1;

        // Subtraction (-)
        // I want you create 2 int variables for me
        // Num3, Num4
        // Assign a value

        // Type VariableName = Value;
        int Num3 = 70;
        int Num4 = 50;

        int Num5 =Num3 - Num4;
        System.out.println("Num5 = " + Num5);

        double DoubleNumber2 = 55; //55.0

        double Num6 = DoubleNumber2 - Num3;

        // Multiplication (*)
        // create 2 int variables
        // Num7 and Num8
        // Assign a value
        // Type VariableName = Value;
        int Num7 = 10;
        int Num8 = 50;
        System.out.println(Num7 * Num8);

        // Division (/)
        // create another 2 variable
        // Num9 and Num10
        //Type VariableName = Value;
        int Num9 = 500;
        int Num10 = 30;
        System.out.println(Num9 / Num10);

        double Num11 = Num9 / Num10;  //16.0     16.666666666667
        System.out.println(Num11);

        // Modulus (%) it will give the remainder

        int Mod1 = 10;
        int Mod2 = 5;       //  10/5= 2      remainder = 0
        int Mod3 = 3;       //  10/3= 3      remainder = 1;

        int Rem1 = Mod1 % Mod2;
        System.out.println(Rem1);

        int Rem2 = Mod1 % Mod3;
        System.out.println(Rem2);

        int Rem3 = Mod2 % Mod3;  // 5/3 = 1;  remainder = 2    1*3 + 2 = 5;
        System.out.println(Rem3);


    }
}
