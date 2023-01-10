package Day7_ForLoop;

public class Topic6_HA_Example2 {
    public static void main(String[] args) {
        /*
        1 - Canada
        2 - Canada
        3 - Canada
        4 - Canada
        5 - Canada
         */

        for (int i = 1; i <= 5; i++) {
            // i=1
            System.out.println(i+" - Canada");
        }

        /*
        Hello 1 Hi
        Hello 2 Hi
        Hello 3 Hi
        Hello 4 Hi
         */

        for (int i = 1; i <= 4 ; i++) {
            System.out.printf("Hello %d Hi\n",i);
        }

    }
}
