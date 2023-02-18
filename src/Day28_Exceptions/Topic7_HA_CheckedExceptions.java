package Day28_Exceptions;

public class Topic7_HA_CheckedExceptions {
    public static void main(String[] args) {
        try {
            Class.forName("Something");
        } catch (Exception e){
            System.out.println("There is an error");
        }
    }
}
