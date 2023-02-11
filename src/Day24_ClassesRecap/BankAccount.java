package Day24_ClassesRecap;

public class BankAccount {
    /*
create a custom class for BankAccount
fields: accountHolder(String), accountNumber(double), balance(double)
methods: totalBalance(), withDraw( amount ), deposit( amount )
     */

    //Fields
    String AccountHolder;
    double AccountNumber;
    private double Balance;  //to check the balance use totalBalance method

    //Methods:
    // PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName
    // Public Private Protected Default <- Access Modifiers

    public double TotalBalance (){
        return Balance;
    }

    public void Deposit (double p_Amount){
        //if i deposit 50 dollars my balance should increase 50 dollars
        Balance = Balance + p_Amount;
    }

    public void Withdraw (double p_Amount){
        if (p_Amount > Balance){
            System.out.println("Insufficient Funds!");
        }
        else {
            Balance = Balance - p_Amount;
        }
    }

}
