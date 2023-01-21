package Day13_Arrays;

public class Topic7_HA_Example2 {
    public static void main(String[] args) {
        // create an integer array with values 5,99,123,-9,0,55

// Create a program that find maximum number in the array
        //DataType [] VariableName = {values};

        int [] Numbers = {5,99,123,-9,0,55};

        int MaxNumber = Numbers[0];
        for (int i = 0; i < Numbers.length; i++) {
            // i need check the number if it is the maximum
            if (MaxNumber < Numbers[i]){
                MaxNumber = Numbers[i];
            }
        }
        System.out.println("MaxNumber = " + MaxNumber);

    }
}
