package Day10_NestedLoops;

public class Topic9_HA_NestedLoopEx5 {
    public static void main(String[] args) {
        /*

        ****    4     i=1   5-i = 4
        ***     3     i=2   5-i = 3
        **      2     i=3   5-i = 2
        *       1     i=4   5-i = 1

         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
