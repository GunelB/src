package Day28_Exception;

public class Topic1_GB_ExceptionIntro {
    public static void main(String[] args) {
        System.out.println("This is line 5");
        try {
            int Avalue = 50 / 0;
        } catch (Exception e) {
            System.out.println("There was a prob");
            System.out.println("Rest of the code");
        }
    }
}