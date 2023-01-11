package Day8_ForLoop;

public class Topic8_HA_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i = " + i);
            if (i == 5){
                break;
            }
        }

        for (int i = 1; i < 1000 ; i++) {
            System.out.println("i = " + i);
            break;
        }

        for (int i = 0; i < 5; i++) {
            if (i==1){
                break;
            }
            System.out.println("i = " + i);
        }

    }
}
