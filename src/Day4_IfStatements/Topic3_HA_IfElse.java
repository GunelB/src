package Day4_IfStatements;

public class Topic3_HA_IfElse {
    public static void main(String[] args) {


        /*
        if (condition){
            if your condition is true execute this code block
        } else {
            if your condition is false execute this code block
        }
         */
        int Age = 16;
        if (Age >= 18){
            System.out.println("Yes, you can vote!");
        } else {
            System.out.println("No, you can not vote!");
        }

        System.out.println("End of the code");

        int a = 50;

        if (a == 10){
            System.out.println("You are right! a = 10");
        } else {
            System.out.println("No, a is not equal to 10!");
        }
    }
}
