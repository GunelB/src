package Day4_IfStatements;

public class Topic2_HA_IfStatementCont {
    public static void main(String[] args) {
        //write a code that check eligibility of voting

        // if you are 18 and up, you can vote, otherwise you can not!
        int Age = 16;

        if (Age >= 18){
            System.out.println("You are eligible to vote!");
        }

        if (Age < 18){
            System.out.println("You are NOT eligible to vote!");
        }
    }
}
