package Day24_ClassesRecap;

public class Topic1_HA_Example1 {
    public static void main(String[] args) {
/*
create a custom class for BankAccount
fields: accountHolder(String), accountNumber(double), balance(double)
methods: totalBalance(), withDraw( amount ), deposit( amount )

create an instance and call BankAccount methods
Ex: if i deposit 50 dollars my balance should increase 50 dollars
  : if i withdraw 100 dollars my balance should decrease for 100 dollars
  : to check the balance use totalBalance method
 */

        // DataType  VariableName = new Constructor();
        BankAccount RBC = new BankAccount();
        RBC.AccountHolder = "Kasey Canbay";
        RBC.AccountNumber = 20230210;

        RBC.Deposit(1000000);

        System.out.println(RBC.TotalBalance());

        RBC.Deposit(2000000);

        System.out.println(RBC.TotalBalance());

        RBC.Withdraw(1500000);

        System.out.println(RBC.TotalBalance());


        System.out.println("--------------------------");

        BankAccount TD = new BankAccount();
        TD.AccountHolder = "Derya Bali";
        TD.AccountNumber = 738001;

        TD.Deposit(10);

        System.out.println("Derya has $"+TD.TotalBalance());

        TD.Withdraw(11.50);


    }
}
