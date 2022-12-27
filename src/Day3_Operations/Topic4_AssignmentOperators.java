package Day3_Operations;

public class Topic4_AssignmentOperators {
    public static void main(String[] args) {
        int ANumber = 22;
        ANumber = 33;
        System.out.println("ANumber = " + ANumber);

        // 33 + 15;
        ANumber = ANumber + 15;

        System.out.println("ANumber = " + ANumber);

        ANumber = ANumber + 55;
        System.out.println("ANumber = " + ANumber);

        ANumber += 15;
        // ANumber = Anumber + 15; this is same thing with above code
        System.out.println("ANumber = " + ANumber);

        ANumber -= 100;
        //ANumber = ANumber - 100; this is same thing with above code
        System.out.println("ANumber = " + ANumber);

        ANumber /= 3;
        // ANumber = ANumber / 3; this is same thing with above code
        System.out.println("ANumber = " + ANumber);

        ANumber *= 5;
        // ANumber = ANumber * 5;
        System.out.println("ANumber = " + ANumber);

        ANumber %= 8;
        // ANumber = ANumber % 8;   30/8= 3;   Remainder = 6;  3*8 + 6;
        System.out.println("ANumber = " + ANumber);
    }
}
