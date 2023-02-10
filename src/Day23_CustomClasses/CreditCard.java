package Day23_CustomClasses;

public class CreditCard {
    public String CardHolder;

    private String CardNumber;

    //Getters and Setters

    //PublicPrivateProtectedDefault StaticorNot ReturnType MethodName

    public void SetCardNumber(String p_CardNumber){
        // "   1234 1234 1234 1234    "
        p_CardNumber = p_CardNumber.trim();   //"1234 1234 1234 1234"
        //"1234123412341234"
        p_CardNumber = p_CardNumber.replace(" ", "");

        if (p_CardNumber.length() == 16){
            CardNumber = p_CardNumber;
        }
    }

    public String GetCardNumber (){
        return "**** **** **** "+CardNumber.substring(CardNumber.length()-4);
    }
}
