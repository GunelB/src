package Day10_NestedLoops;

public class Topic11_HA_ForInsideWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5){
            System.out.println("i = " + i);

            for (int j = 1; j <=2 ; j++) {
                System.out.println("j = " + j);
            }

            i++;
        }
    }
}
