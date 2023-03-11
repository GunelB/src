package Day38_InterviewPractice;

public class Topic1_HA_Fibonacci {
    public static void main(String[] args) {
        //     0 1 1 2 3 5 8 13 21 34 .............
//             a b ne
        //     0 1 1 2 3 5 8 13 21 34 .............
//               a b ne
        //     0 1 1 2 3 5 8 13 21 34 .............
//                 a b ne
        //     0 1 1 2 3 5 8 13 21 34 .............
//                   a b ne



        //      0 + 1 = 1
        //      1 + 1 = 2
        //      1 + 2 = 3
        //      2 + 3 = 5
        //      3 + 5 = 8


        int HowMany = 20;    //  0 1 1 2 3 5 8

        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 2; i < HowMany; i++) {
            int NextOne = a + b;
            System.out.print(NextOne+" ");
            a = b;
            b = NextOne;
        }



    }
}
