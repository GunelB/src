package Day18_Methods;

public class Topic2_HA_3Chars {
    public static void main(String[] args) {
        // BIBOBOBPIPDUD
        String s = "BIBOBOBPIPDUD";
            //      0123456789101112
        String First3char = s.substring(0, 3);
        String Second3char = s.substring(1, 4 );
        String Third3char = s.substring(2, 5);
        String Last3char = s.substring(10,13);

        for (int i = 0; i <= 10 ; i++) {
            // i=0
            String Actual3char = s.substring(i, i+3);
            PrintWord(Actual3char);
            //i=1
        }

    }

    public static void PrintWord (String Word){
        System.out.println("Word = " + Word);
    }
}
