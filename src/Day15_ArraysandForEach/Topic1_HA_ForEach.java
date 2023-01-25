package Day15_ArraysandForEach;

import java.util.Arrays;

public class Topic1_HA_ForEach {
    public static void main(String[] args) {
        // DataType [] VariableName = {Value1, value2, .......}
        int [] Numbers = {15,4,7,39,44,21,18};
        for (int i = 0; i < Numbers.length; i++) {
            int MyCurrentNumber = Numbers[i];
            System.out.println("MyCurrentNumber = " + MyCurrentNumber);
        }
        System.out.println("****************");
        for (int MyNumber : Numbers ){
            System.out.println("MyNumber = " + MyNumber);
        }

        String [] Animals = {"Dog", "Cat", "Horse"};
                            // 0      1       2
        for (int i = 0; i < Animals.length; i++) {
            String MyCurrentAnimal = Animals[i];
            System.out.println("MyCurrentAnimal = " + MyCurrentAnimal);
            // Animals[i]  <- i=0 first iteration Animals[0] <- Dog
            // Animals[i]  <- i=1 second iteration Animals[1] <- Cat
        }

        // for (DataType VariableName: MyArrayVariableName ){}
        for ( String MyCurrentAnimalwithForEach : Animals ){
            System.out.println("MyCurrentAnimalwithForEach = " + MyCurrentAnimalwithForEach);
        }

        String Hi = "Hello"; // {'H', 'e', 'l', 'l', 'o'}
        char [] HiArray = Hi.toCharArray();
        System.out.println(Arrays.toString(HiArray));

        // for (DataType VariableName: MyArrayVariableName ){}
        for (char MyChar:HiArray){
            System.out.println("MyChar = " + MyChar);

            //System.out.print(MyChar+", ");
        }

    }
}
