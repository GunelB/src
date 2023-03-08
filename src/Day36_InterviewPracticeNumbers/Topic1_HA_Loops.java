package Day36_InterviewPracticeNumbers;

public class Topic1_HA_Loops {
    public static void main(String[] args) {
        String[] Words = {"Java", "Derya", "Starbucks", "Ticketmaster", "Tesla"};

        System.out.println("***Using For Loop***");

        for(int i=0; i < Words.length; i++){
            System.out.println(Words[i]);
        }

        System.out.println("***Using For Each***");
        for(String MyWord : Words){
            System.out.println(MyWord);
        }

        System.out.println("***Using While Loop***");
        int i = 0;
        while (i < Words.length){
            System.out.println(Words[i]);
            i++;
        }

        /*
        i = 100;
        do {
            System.out.println("Anything");
        }while (i<Words.length);

        // Repeat - until

         */



    }
}
