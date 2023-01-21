package Day13_Arrays;

public class Topic2_HA_Arrays {
    public static void main(String[] args) {
        // DataType [] VariableName = {My Values will be here};
        int [] MyIntArray = {3, 5, 9, 7};
                           //0  1  2  3

        // MyIntArray[0]  <- this will return the number 3 in the array

        System.out.println("The first value in the array ="+MyIntArray[0]);

        // MyIntArray[1]

        System.out.println("The second value in the array ="+MyIntArray[1]);

        // MyIntArray[6]

        // when you try to get a value in the index that does not exist it will throw an error
        // System.out.println(MyIntArray[6]);  This line will throw an error

        System.out.printf("The first number is %d and The second number is %d", MyIntArray[0], MyIntArray[1] );

        System.out.println("*********************************");

        String [] Names = {"Oznur", "Canan", "Tesla", "Libby", "Tugce", "EnnerValencia", "Murat", "Eren", "Kasey", "Derya", "Abdulmuttalip"};
                        //    0        1        2        3        4             5           6        7       8        9             10
        System.out.println("The first name in the list = "+Names[0]);
        System.out.println("The 5th name in the list = "+Names[4]);

        System.out.println("The last name in the list = "+Names[10]);

        System.out.println(Names);

        System.out.println("The length of the Names is "+ Names.length);

        System.out.println("The last name is = "+Names[Names.length-1]); // The length of array is 11

        int [] MyNumber = {5,7,8,9};
                        // 0 1 2 3
        System.out.println(MyNumber[MyNumber.length-1]);
        System.out.println("**********************");
        for (int i = 0; i <=MyNumber.length-1 ; i++) {  // instead of 3 what can I write-> the length of MyNumber is 4
            // i=0
            System.out.println(MyNumber[i]);
        }

        // I want to print all the names in the Names array

        for (int i = 0; i < Names.length; i++) {  // i<=10    i<11
            System.out.println(Names[i]);
        }


    }
}
