package Day13_Arrays;

public class Topic6_HA_Example {
    public static void main(String[] args) {
        // DataType [] VariableName = {values};   <- how to define an array with values
        // DataType [] VariableName = new DataType[Length];  <- how to define an empty array

        int [] Ages = {35,30,38,18,51,22};

        // write a program that find the average age
        //  Average = Total / HowManyNumbers

        double Total = 0;
        for (int i = 0; i < Ages.length; i++) {
            // Ages[i]
            Total = Total + Ages[i];
            // 1. iteration     Total = 0 + 35
            // 2. iteration     Total = 35 + 30
            // .....
        }
        System.out.println("Total = " + Total);
        double Average = Total / Ages.length;
        System.out.println("Average = " + Average);

    }
}
