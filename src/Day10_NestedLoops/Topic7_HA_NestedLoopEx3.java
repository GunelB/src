package Day10_NestedLoops;

public class Topic7_HA_NestedLoopEx3 {
    public static void main(String[] args) {
        /*
           $            1 dollar sign
           $$           2 dollar sign
           $$$          3 dollar sign
           $$$$         4 dollar sign
           $$$$$        5 dollar sign
         */
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
