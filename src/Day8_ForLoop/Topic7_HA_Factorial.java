package Day8_ForLoop;

public class Topic7_HA_Factorial {
    public static void main(String[] args) {
        /*
           5! = 1*2*3*4*5
           3! = 1*2*3
           9! = 1*2*3*4*5*6*7*8*9
         */

        /*
        5!= 1*2*3*4*5
        
        1*2 = 2     2*3*4*5
        2*3 = 6     6*4*5
        6*4 = 24    24*5
        24*5 = 120
         */

        int Total = 1;
        for (int i = 2; i <=5 ; i++) {
            Total= Total*i;
        }

        System.out.println("Total = " + Total);
    }
}
