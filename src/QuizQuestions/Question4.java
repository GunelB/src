package QuizQuestions;

public class Question4 {
    public static void main(String[] args) {
        int i = 0;
        i = i++ - --i + ++i - i--;
        // i++ - --i + ++i - i--    i=0
        // 0 - --i + ++i - i--      -> i = 1;
        // 0 - 0 + ++i - i--        -> i = 0;
        // 0 - 0 + 1 - i--          -> i = 1;
        // 0 - 0 + 1 - 1            -> i = 0;

        //i = 0 - 0 + 1 - 1
        //i = 0;

        System.out.println("i = " + i);
    }
}
