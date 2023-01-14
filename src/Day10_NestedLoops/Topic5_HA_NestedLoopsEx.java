package Day10_NestedLoops;

public class Topic5_HA_NestedLoopsEx {
    public static void main(String[] args) {
        /*
        i want to print below table

        1 2 3
        1 2 3
        1 2 3
        1 2 3
        1 2 3
         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                if (j<3) {
                    System.out.print(j + " ");
                }else {
                    System.out.println(j + " ");
                }
            }
        }
    }
}
