package QuizQuestions;

public class Question3 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        int c = a + b + a++ + b++ + ++a + ++b;
        // a + b + a++ + b++ + ++a + ++b
        // 11 + b + a++ + b++ + ++a + ++b     -> a = 11;   b = 22;
        // 11 + 22 + a++ + b++ + ++a + ++b    -> a = 11;   b = 22;
        // 11 + 22 + 11 +  b++ + ++a + ++b    -> a = 12;   b = 22;
        // 11 + 22 + 11 + 22 + ++a + ++b      -> a = 12;   b = 23;
        // 11 + 22 + 11 + 22 + 13 + ++b       -> a = 13;   b = 23;
        //int c =  11 + 22 + 11 + 22 + 13 + 24        -> a = 13;   b = 24;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
