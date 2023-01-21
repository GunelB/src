package Day13_Arrays;

public class Topic3_HA_ArraysCont {
    public static void main(String[] args) {
        // DataType [] VariableName = {My Values will be here};

        int [] Numbers = {7,55,26,35,51,44,0,-90};

        System.out.println("The first number = "+Numbers[0]);

        Numbers[0] = 11;

        System.out.println("After I changed the first number, it is equal "+Numbers[0]);

        Numbers[1]= 30;

        Numbers[5] = 1;

        // DataType [] VariableName = {My Values will be here};
        String [] Cars = {"Tesla", "Volkswagen", "Bmw", "Mercedes-Benz"};

        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }

        Cars[1] = "Lamborghini";
        Cars[2] = "Porsche";

        System.out.println("**************");
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }


    }
}
