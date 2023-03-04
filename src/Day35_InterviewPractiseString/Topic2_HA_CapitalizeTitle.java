package Day35_InterviewPractiseString;

public class Topic2_HA_CapitalizeTitle {
    public static void main(String[] args) {
        // jaVa iS eASy <- Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASy"));
    }

    public static String UsingSplit(String p_Sentence){
        String[] MyWords = p_Sentence.split(" ");
        String CapitalizedString = "";
        for (String Word : MyWords){
            // Word = jaVa
            String FirstChar = Word.substring(0,1);
            String RemainingChars = Word.substring(1);

            // j    aVa
            // J    ava

            FirstChar = FirstChar.toUpperCase();
            RemainingChars = RemainingChars.toLowerCase();

            CapitalizedString = CapitalizedString + FirstChar + RemainingChars+" ";
        }
        return CapitalizedString.trim();
    }
}
