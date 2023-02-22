package Day29_Exceptions;

public class Topic2_HA_BankExample {
    public static void main(String[] args) {
        //DataType VariableName = new Constructor(parameters defined in constructor)
        //DataType VariableName = new DataType();

        BankAccount MyAccount = new BankAccount(3500000);

        MyAccount.Deposit(1000000);
        try {
            MyAccount.Withdraw(11.50);
        }catch (InsufficentException e){
            System.out.println(e.Message);
        }

        BankAccount DeryasBankAccount = new BankAccount(5.78);

        DeryasBankAccount.Deposit(4.57);

        try {
            DeryasBankAccount.Withdraw(11.50);
        }catch (InsufficentException e){
            System.out.println(e.Message);
        }
    }
}

class BankAccount {
    double Balance;

    // create a constructor that takes a double param and assign it to balance
    public BankAccount(double p_Balance){
        Balance = p_Balance;
    }

    // create a method for deposit money
    // balance = balance + p_amount
    public void Deposit(double p_Amount){
        Balance = Balance + p_Amount;
    }


    // create a method for withdraw money
    // balance = balance - p_amount

    public void Withdraw(double p_Amount) throws InsufficentException {
        if (Balance < p_Amount){
            // we need to tell you don't have enough money
            /*
            try
            catch
            finally

            throw
            throws
             */
            throw new InsufficentException();
        }
        else {
            Balance = Balance - p_Amount;
        }
    }
}

class InsufficentException extends Exception {
    String Message;

    public InsufficentException(){
        Message = "I'm sorry! You don't have enough money in your account.";
    }
}