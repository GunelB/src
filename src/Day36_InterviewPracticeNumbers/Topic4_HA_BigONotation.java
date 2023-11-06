package Day36_InterviewPracticeNumbers;

public class Topic4_HA_BigONotation {
    public static void main(String[] args) {
        // Big O Notation
        // How long takes an algorithm to run.

        // Constant time algorithms
        // O(1)

        int i = 25;
        System.out.println(i);

        //O(1)

        /*
        Clearly, it doesn't matter what is the value of i.
        This piece of code takes a constant amount of time to run.
        it is not dependent on the value of i;
         */

        int j = 34;
        System.out.println("The value of j = "+j);
        System.out.println("Yes it is equal to "+j);
        System.out.println("Ok, we know it is equal to "+j);

        //O(3)   -->   O(1)
        /*
        The above example is also constant time.
        Even if it takes 3 times as long to run,
        it doesn't depend on the value of j

        We don't care about exactly how long it takes to run,
        only that it takes a constant time.
         */


        // O(n)
        int MyValue = 5;
        for (int k = 0; k < MyValue; k++) {
            System.out.println(k);
        }

        /*
        How many times does this for loop run? 5
        if MyValue = 10, we have to print 10 times;
        if MyValue = 1000, we have to print 1000 times.
         */


        // O(n^2)    ->  O(n^p)
        int First = 10;
        int Second = 100;

        for (int k = 0; k < First; k++) {
            for (int l = 0; l < Second; l++) {
                System.out.println("Hello");
            }
        }

    }
}
