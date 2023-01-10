package Day7_ForLoop;

public class Topic5_HA_ForLoopExample {
    public static void main(String[] args) {
        /*
        abcdefghijklmnopqrstuvwxy
        divide this word to 5 and print it
        abcde
        fghij
        klmno
        pqrst
        uvwxy
         */
        String Word = "abcdefghijklmnopqrstuvwxy";

        for (int i = 0; i < 21 ; i = i+5) {
            System.out.println(Word.substring(i,i+5));
        }
        /*
        System.out.println(Word.substring(0,5));  <- i=0
        System.out.println(Word.substring(5,10)); <- i=5
        System.out.println(Word.substring(10,15));<- i=10
        System.out.println(Word.substring(15,20));<- i=15
        System.out.println(Word.substring(20,25));<- i=20

        System.out.println(Word.substring(25,30));<- i=25
        */
    }
}
