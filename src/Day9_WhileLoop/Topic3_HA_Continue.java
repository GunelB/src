package Day9_WhileLoop;

public class Topic3_HA_Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println("i = " + i);
            if (i==5){
                break;
            }
        }
        System.out.println("***********************");
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is before continue and i = "+i);

            if (i==3){
                continue;
            }
            System.out.println("This is after continue and i = "+i);
        }
    }
}
