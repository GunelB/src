package Day3_Operations;

public class Topic3_RelationalOperations {
    public static void main(String[] args) {
        // check if it is equal
        int N1 = 10;

        // N1 == 11
        // boolean  this variable can only be true, false

        boolean IsItEqual = N1 == 10;
        System.out.println(IsItEqual);

        // to check if it is higher we will use >
        boolean IsItHigher = N1 > 10; // it will be true if it is greater than 10
        System.out.println(IsItHigher);

        // to check if it lower (less than) we will use <
        boolean IsItLower = N1 < 10; // n1 = 10     10 < 10
        System.out.println(IsItLower);

        // if it is greater than and equal >=
        boolean IsItGreaterAndEqual = N1 >= 10;  // 10 >= 10

        // if it is less than and equal <=
        boolean IsItLessAndEqual = N1 <= 10;
        System.out.println("IsItLessAndEqual = " + IsItLessAndEqual);

        // i want to check if they are equal ==
        // i want to check if they are NOT equal !=

        boolean B1 = N1 != 5;
        System.out.println("B1 = " + B1);

        boolean B2 = N1 != 10;
        System.out.println("B2 = " + B2);

        boolean B3 = true;
        boolean B4 = !B3;
        System.out.println("B4 = " + B4);

        boolean B5 = !(N1 == 10);
        System.out.println("B5 = " + B5);

        String School = "RenasTech";
        boolean B6 = School == "RenasTech";
        System.out.println("B6 = " + B6);
    }
}
