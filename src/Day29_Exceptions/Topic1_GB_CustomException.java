package Day29_Exceptions;

public class Topic1_GB_CustomException {
    public static void main(String[] args) {

    }

    public static void ValidateAge(int p_Age){
        if(p_Age < 18){
            throw new  NullPointerException("");
        }
        else {
            System.out.println("You can vote");
        }
    }

}
 class NotEligibleToVoteException extends Exception{
    String Message;

     public NotEligibleToVoteException(String p_1){
         Message= p_1;
     }

 }

