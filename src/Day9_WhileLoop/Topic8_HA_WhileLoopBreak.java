package Day9_WhileLoop;

public class Topic8_HA_WhileLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println("i = " + i);

            if (i == 3){
                break;
            }

            i++;
        }

        System.out.println("************************");
        int any = 0;
        while (any < 5){
            //System.out.println("This is before continue");

            if(any == 1){
                any = any + 5;
            }
            System.out.println("any = " + any);
            any++;
        }
        // 0 6
    }
}
