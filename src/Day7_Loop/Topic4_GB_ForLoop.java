package Day7_Loop;

public class Topic4_GB_ForLoop {

    public static void main(String[] args) {
        System.out.println("Hello");
        /* for loop
        starting point
        ending point
        increase value
        for(starting;ending;increase){}
        for(int i=0; i<100; i++ ) {
            for (int j =0; j <10; j++) {
                System.out.println("Hello " + j);

/*
divide this word to 5 and print it
abcde
fghij
klmno
pqrst
uvwxy
 */
                String Word = "abcdefghijklmnopqrstuvwxy";
                for(int i = 0;i < 26; i = i+5){
                    System.out.println(Word.substring(i,i+5));

                }
            }

            }





