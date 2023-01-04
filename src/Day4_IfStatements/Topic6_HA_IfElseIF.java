package Day4_IfStatements;

public class Topic6_HA_IfElseIF {
    public static void main(String[] args) {
        /*
            if (check if it is positive){
                say it is positive
            } else if(check if it is negative){

            }
             else if (equal to 0) {
            }
         */
        // a number can be positive, negative or equal to 0

        int Number = 50;
        if (Number > 0){
            System.out.println("it is positive");
        } else if(Number < 0){
            System.out.println("It is negative");
        } else if(Number == 0){
            System.out.println("it is equal to 0");
        } else if(Number == 4){
            System.out.println("it is equal to 4");
        } else if(Number >= 20){
            System.out.println("it is greater than 20");
        }

        System.out.println("End of the code");
    }
}
