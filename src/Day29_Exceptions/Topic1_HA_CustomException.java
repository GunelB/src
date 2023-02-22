package Day29_Exceptions;

public class Topic1_HA_CustomException {
    public static void main(String[] args) {
        try {
            ValidateAge(15);
        }catch (NotEligibleToVoteException e){
            System.out.println(e.Message);
        }

        try {
            ValidateAge(21);
        }catch (NotEligibleToVoteException e){
            System.out.println("There is an error");
        }
    }

    /*

    try
    catch
    finally
    throw
    throws
     */
// what is difference between throw and throws?
    public static void ValidateAge(int p_Age) throws NotEligibleToVoteException {
        if (p_Age < 18){
            throw new NotEligibleToVoteException("You can not vote!");
        }
        else {
            System.out.println("You can vote");
        }
    }
}

class NotEligibleToVoteException extends Exception{
    String Message;

    // create a constructor for this class that takes a string param and assign it to message
    public NotEligibleToVoteException(String p_Message){
        Message = p_Message;
    }
}

