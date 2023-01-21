package Day13_Arrays;

public class Topic3_GB_ArraysCont {
    public static void main(String[] args) {
        //DataType[]VariableName={My Values will be here};

        int[] Numbers = {7,55,26,35,51,44,0,-90};
        System.out.println("The first number =" +Numbers[0]);
        Numbers[0]=11;
        System.out.println("After I changed number"+Numbers[0]);
        String[] Cars={"Tesla","BMW","Mercedes-Benz"};
        for (int i = 0; i < Cars.length ; i++) {

        }
        System.out.println(Cars[2]);
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }
        Cars[1]= "Lamborghini";

    }
}
