package Day7_ForLoop;

public class Topic3_HA_StringMethodsExample3 {
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
        System.out.println(Word.substring(0,5));
        System.out.println(Word.substring(5,10));
        System.out.println(Word.substring(10,15));
        System.out.println(Word.substring(15,20));
        System.out.println(Word.substring(20,25));
        System.out.println(Word.substring(20));  // <- same with above
    }
}
