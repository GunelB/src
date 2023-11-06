package Day35_InterviewPractiseString;

public class Topic1_HA_ReverseString {
    public static void main(String[] args) {
        System.out.println(UsingStringBuilder("This is the first example."));
        System.out.println("*************");
        System.out.println(RegularWay("Poor Girl"));
        System.out.println("****************");
        System.out.println(RegularWayWithForEach("I Love Canada"));
    }

    public static String UsingStringBuilder(String p_Word){
        StringBuilder SB = new StringBuilder(p_Word);
        SB.reverse();
        return SB.toString();
    }

    public static String RegularWay(String p_Word){
        String ReversedString = "";
        for (int i = 0; i < p_Word.length(); i++) {
            ReversedString = p_Word.charAt(i) + ReversedString;
        }
        return ReversedString;
    }

    public static String RegularWayWithForEach(String p_Word){
        char[] MyCharArray = p_Word.toCharArray();
        String ReversedString = "";
        for (char MyChar :MyCharArray){
            ReversedString = MyChar + ReversedString;
        }
        return ReversedString;
    }

}
