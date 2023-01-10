package Day7_ForLoop;

public class Topic4_HA_ForLoop {
    public static void main(String[] args) {

        System.out.println("Hello");
        // do something and print it 100 times

        /*
        loops
        1- for loop
        starting point
        ending point
        increase value
        for (starting; ending; increase){}
         */

        for (int i = 0; i < 100;  i++ ){
            System.out.println("Hello");
        }

        for (int i = 5; i <= 10; i = i+1) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i = i+3) {
            System.out.println("Hello "+i);
        }

        System.out.println("It will come here after 9");
    }
}
