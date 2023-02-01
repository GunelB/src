package Day19_Methods;

public class Topic3_HA_Example2 {
    public static void main(String[] args) {
        int x = 4;
        x += x++ + ++x + x;
        /*   x += 5;   -> x = x + 5;
                x += x++ + ++x + x;
                x = x + x++ + ++x + x;
                 4 + x++ + ++x + x;
                 4 + 4 + ++x + x;    x = 5
                 4 + 4 + 6 + x;      x = 6
                 4 + 4 + 6 + 6;
               x = 20

         */


        System.out.println(x);
    }
}
