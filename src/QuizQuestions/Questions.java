package QuizQuestions;

public class Questions {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;
        //i++ + ++i

        // 11 + ++i;   ->  i=12
        // 11 + 13;
        // i = 11 + 13
        // i = 24;

        // i++ -> first read it and as soon as you read it, increase the value by one
        // ++i -> first increase the value by one, and then read it

        System.out.println("i = " + i);
    }
}
