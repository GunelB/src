package Day3_Operations;

public class Topic5_LogicalOperations {
    public static void main(String[] args) {
        String Car = "Tesla";
        boolean IsItTesla = Car == "Tesla";
        System.out.println("IsItTesla = " + IsItTesla);

        String Color = "Red";
        boolean IsItWhiteTesla = (Car == "Tesla") && (Color == "White");
        //                              true      && true  = true
        //                              true      && false = false
        System.out.println("IsItWhiteTesla = " + IsItWhiteTesla);

        String AnotherCar = "Ford";

        boolean CanIPass = (Car == "BMW") || (Car == "Ford");
        //                      true        ||   false    = true;
        //                      false       ||  false   = false;
        System.out.println("CanIPass = " + CanIPass);


        int a = 5;
        int c = 7;
        boolean b = a >= 5 && c <= 15;

    }
}
