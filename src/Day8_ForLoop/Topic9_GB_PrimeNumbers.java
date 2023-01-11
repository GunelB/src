package Day8_ForLoop;

public class Topic9_GB_PrimeNumbers {
    public static void main(String[] args) {
        //2 3 5 7 9 11
        for (int i = 2; i <=6; i++) {
            //find remainder
            int Remainder = 7 % i;
            boolean IsItAPrimeNumber = true;
            if(Remainder == 0){
                IsItAPrimeNumber = false;
                System.out.println("it is not a prime number");

            }
        }
    }
}
