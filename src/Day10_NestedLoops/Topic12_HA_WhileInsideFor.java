package Day10_NestedLoops;

/*
Bubble sort algorithm  <- Arrays, Nested Loop
 */

public class Topic12_HA_WhileInsideFor {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("i = " + i);

            int j = 1;
            while (j <= 2){
                System.out.println("j = " + j);
                j++;
            }
        }
    }
}
