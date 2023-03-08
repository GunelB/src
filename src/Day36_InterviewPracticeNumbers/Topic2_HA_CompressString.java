package Day36_InterviewPracticeNumbers;

public class Topic2_HA_CompressString {
    public static void main(String[] args) {
        // AAABBBBCCDDDAAB   <- 3A4B2C3D2A1B
        String Letters = "AAABBBBCCDDDAAB";

        CompressString(Letters);
        System.out.println("****************");
        CompressString("aabbbbbccaaa");   //<- 2a5b2c3a
    }

    // Create a method
    // CompressString
    // No Return
    // Parameters - 1 String

    public static void CompressString(String p_Letters){
        /*
        A A A B B B B C C D D D A A B

        3A 4B
        I need to get each char
        i need to keep the count
        I need to keep track of the last char
        if the last char is same with the new char, increase the count
        if not, stop counting and print it
         */

        //I need to get each char
        // I can use String.charAt or I can use String.toCharArray
        //AAABBBBCCDDDAAB
        char[] MyCharArray = p_Letters.toCharArray();

        //A A A B B B B C C D D D A A B
        char OldChar = MyCharArray[0];
        int Count = 1;


        for (int i = 1; i < MyCharArray.length ; i++) {
            char NewChar = MyCharArray[i];  // A <- the second A

            // i = 1, we are in the first iteration
            // OldChar = A
            // NewChar = A

            // i = 3,
            // OldChar = A
            // NewChar = B
            // Count = 3

            // A A A B B B B C C D D D A A B
            // i = 4
            // OldChar = B
            // NewChar = B
            // Count = 1

            if (OldChar == NewChar){
               Count++;
            } else {
                // if they are not equal I need to print it
                // I need to print 3A
                //    3    A
                // instead of 3, we can use Count
                // instead of A, we can use OldChar
                System.out.print( Count+Character.toString(OldChar) );  // 3A    T=84   A=65

                OldChar = NewChar;
                Count = 1;

            }


        }


        // OldChar = B
        // Count = 1

//        System.out.print("1B");
        System.out.print(Count + Character.toString(OldChar));



    }
}
