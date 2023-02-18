package Day28_Exceptions;

public class Topic1_HA_ExceptionsIntro {
    public static void main(String[] args) {
        System.out.println("This is line 5");

        try {
            // add your code between try block
            int AValue = 50/0;
        } catch (Exception e){
            System.out.println("There was a problem in line 9");
        }


        System.out.println("Something");
        System.out.println("Rest of the code");
    }
}

/*
To handle an exception we need to use try catch block
We need to memorize it.

try {
    your code will be here
}
catch (Exception e){
  if there is an exception in try block, the code in catch block is get executed.
}
 */
