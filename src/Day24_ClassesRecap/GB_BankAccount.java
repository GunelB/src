package Day24_ClassesRecap;

public class GB_BankAccount {
    /*
create a custom class for BankAccount
fields: accountHolder(String), accountNumber(double), balance(double)
methods: totalBalance(), withDraw( amount ), deposit( amount )

create an instance and call BankAccount methods
Ex: if i deposit 50 dollars my balance should increase 50 dollars
  : if i withdraw 100 dollars my balance should decrease for 100 dollars
  : to check the balance use totalBalance method
 */
    //Fields
    String AccountHolder;
    double AccountNumber;
   private double Balance;
   //Methods
    //PublicPrivateProtectedDefault StaticOrNot Return type method name

    public double TotalBalance (){
        return Balance;
    }
    public void Deposit (double p_Amount){
       // if i deposit 50 dollars my balance should increase 50 dollars
          Balance=Balance+p_Amount;
    }
    public void Withdraw(double p_Amount){
        if(p_Amount>Balance){
            System.out.println("Insufficient Funds");
        }
        else{
            Balance= Balance-p_Amount;
        }
    }

}
