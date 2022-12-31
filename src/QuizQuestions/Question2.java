package QuizQuestions;

public class Question2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        int c = a + b + a++ + b++ + ++a + ++b;
            //a + a++ + ++a;
        // 11 + a++ + ++a;   a=11;
        // 11 + 11 + ++a;    a=12;
        // 11 + 11 + 13;     a=13;

        System.out.println("a = " + a);
    }
}
