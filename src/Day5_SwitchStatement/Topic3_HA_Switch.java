package Day5_SwitchStatement;

public class Topic3_HA_Switch {
    public static void main(String[] args) {
        // if statement
        // switch case

        int Number = 20;

        switch (Number){
            // case block
            case 10:
                System.out.println("The number is 10");
                System.out.println("Another line");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("The number is not 10, 20 or 30");
        }

        if(Number==10){
            System.out.println("The number is 10");
        } else if (Number == 20){
            System.out.println("The number is 20");
        } else if (Number == 30){
            System.out.println("The number is 30");
        } else {
            System.out.println("The number is not 10, 20 or 30");
        }
    }
}
