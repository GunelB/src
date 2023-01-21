package Day13_Arrays;

public class Topic5_HA_ArraysCont {
    public static void main(String[] args) {
        // create an empty int array and the length is 4
        //DataType [] VariableName = new DataType[Length]
        int [] Numbers = new int[4]; // {0,0,0,0}

        Numbers[0] = 4;
        Numbers[1] = 7;
        Numbers[2] = 50;
        Numbers[3] = 88;

        // {4,7,50,88}

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }

        // create an empty int array and the length is 10
        //DataType [] VariableName = new DataType[Length]

        int [] MyArray = new int[10]; //{0,0,0,0,0,0,0,0,0,0}


        // I want to achieve this {5,6,7,8,9,10,11,12,13,14}
        for (int i = 0; i < MyArray.length; i++) {
            // i = 0 in the first iteration
            MyArray[i] = i+5;  // in the first iteration it should be equal to 5
        }

        for (int i = 0; i < MyArray.length; i++) {
            System.out.println(MyArray[i]);
        }
    }
}
