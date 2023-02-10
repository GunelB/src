package Day23_Classes_Encapsulation;


import Day23_CustomClasses.CreditCard;

public class Topic2_HA_Example {
    public static void main(String[] args) {
        CreditCard MyVisa = new CreditCard();

        MyVisa.CardHolder ="John Doe";

        MyVisa.SetCardNumber("   1234 1234 1234 7891    ");

        System.out.println(MyVisa.GetCardNumber());

    }
}
