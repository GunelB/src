package Day4_IfStatements;

public class Topic5_HA_OddEven {
    public static void main(String[] args) {
        // find odd or even
        // even numbers 2 4 8 20   <- they can divide to 2 and remainder will be 0
        // odd numbers 1 3 15 99   <- they can not divide to 2. the remainder will be 1

        int Number = 20;
        int Remainder = Number % 2; //modulo, remainder   % <- to find the remainder
        System.out.println("Remainder = " + Remainder);

        // I will get either 1 or 0.
        // if it is 1, it is an odd number
        // if it is 0, it is an even number

        if (Remainder == 1){
            System.out.println(Number+" is an odd number!");
        } else {
            System.out.println(Number+" is an even number!");
        }
    }
}
