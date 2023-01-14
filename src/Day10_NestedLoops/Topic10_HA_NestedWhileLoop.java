package Day10_NestedLoops;

public class Topic10_HA_NestedWhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
            for (int j = 1; j <=5; j++) {
                System.out.println(j);
            }
        }
        /*
        write while loop equivalent of above code
         */
        int i =1;
        while (i<=5){
            System.out.println(i);

            int j = 1;
            while (j<=5){
                System.out.println(j);
                j++;
            }


            i++;
        }
    }
}
