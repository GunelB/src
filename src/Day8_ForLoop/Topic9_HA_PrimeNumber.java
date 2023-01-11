package Day8_ForLoop;

public class Topic9_HA_PrimeNumber {
    public static void main(String[] args) {
        /* Write a program to check whether a number is prime or not.
        What are prime numbers?
        In other words, the prime number is a positive integer greater than 1 that has exactly two factors, 1 and the number itself.
        There are many prime numbers, such as 2, 3, 5, 7, 11, 13, etc.
        Keep in mind that 1 cannot be either prime or composite.
        The remaining numbers, except for 1, are classified as prime and composite numbers.
         */

        /*
          7/2  remainder = 1      2*3 + 1
          7/3  remainder = 1      3*2 + 1
          7/4  remainder = 3      4*1 + 3
          7/5  remainder = 2      5*1 + 2
          7/6  remainder = 1      6*1 + 1

          9/2  remainder = 1    2*4 + 1
          9/3  remainder = 0    3*3 + 0
          9/4
          9/5
          9/6
          9/7
          9/8
         */
        int Number = 9999999;
        boolean IsItAPrimeNumber = true;
        for (int i = 2; i <=Number-1 ; i++) {
//            7/2 find remainder
//            int Remainder = 7 % 2;
            int Remainder = Number % i;
            if (Remainder == 0){
                IsItAPrimeNumber = false;
                break;
            }
        }
        if (IsItAPrimeNumber == true){
            System.out.println("It is a prime number");
        }else {
            System.out.println("It is not a prime number");
        }
    }
}
