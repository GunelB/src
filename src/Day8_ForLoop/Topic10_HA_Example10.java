package Day8_ForLoop;

public class Topic10_HA_Example10 {
    public static void main(String[] args) {
        //write a program that will print numbers from 15 to 5
        //Expected output: 15 14 13 12 11 10 9 8 7 6 5
        // i--
        // i-=1
        // i= i-1

        for (int i = 15; i >=0 ; i--) {
            System.out.print(i+" ");
            if (i == 5){
                break;
            }
        }
        System.out.println("");

        for (int i = 15; i >=0 ; i--) {
            if (i==4){
                break;
            }
            System.out.print(i+" ");
        }
    }
}
