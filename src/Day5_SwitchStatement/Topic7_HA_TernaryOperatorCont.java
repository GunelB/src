package Day5_SwitchStatement;

public class Topic7_HA_TernaryOperatorCont {
    public static void main(String[] args) {
        // lets find if it is odd or even

        int Number = 55;

        /*
        if (Number % 2 == 0){
            Even
        } else {
            Odd
        }
         */

        // (condition) ? true : false;
        String Type = (Number % 2 == 0) ? "Even" : "Odd";
        System.out.println(Type);


        // int Max = (condition) ? Return value if it is true : return value if it is false;
    }
}
