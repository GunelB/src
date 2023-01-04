package Day4_IfStatements;

public class Topic4_HA_IfElseCont {
    public static void main(String[] args) {
        // check if a number is positive or not
        // if the number is greater than 0, it is a positive number

        int Number = -5;

        if (Number > 0){
            System.out.println("It is a positive number!");
        } else {  // this portion actually means if(Number <= 0)
            System.out.println("it is NOT a positive number!");
        }
    }
}
