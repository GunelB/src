package Day5_SwitchStatement;

public class Topic5_HA_SwitchCont {
    public static void main(String[] args) {
        int Day = 2;
        /*  1 = Monday
            2 = Tuesday
            3 = Wednesday
            4 = Thursday
            5 = Friday
            6 = Saturday
            7 = Sunday
            otherwise = Invalid Day
         */

        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        switch (Day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
