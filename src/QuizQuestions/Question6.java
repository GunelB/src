package QuizQuestions;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Java"+20+30);

        // "Java"+20+30
        // "Java20" + 30
        // "Java2030"

        System.out.println(20+30+"Java");
        //20+30+"Java"
        //50+"Java"
        //"50Java"


        //System.out.println("Java"+20-30); <- this will give an error
        //"Java"+20-30
        // "Java20"-30

        System.out.println("Java"+(20-30));
        //"Java"+(20-30)
        //"Java"+ (-10)
        // "Java-10"
    }
}
