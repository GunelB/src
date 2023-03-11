package Day38_InterviewPractice;

public class Topic2_HA_Fibonacci2 {
    public static void main(String[] args) {
        //if we want to print fibonacci numbers between 89 - 10946

        int a = 0;
        int b = 1;

        int Nextone = a + b;

        while(Nextone <= 10946){
            if (Nextone >= 89){
                System.out.print(Nextone+" ");
            }

            a = b;
            b = Nextone;
            Nextone = a + b;

        }
    }
}
