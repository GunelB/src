package Day33_StringBuilder;

public class Topic2_HA_Immutable {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("Hi");
        s.replace("el", "ol");
        System.out.println(s);
        //String is immutable

        // String builder is mutable
        StringBuilder SB = new StringBuilder("Hello");
        SB.append("Hi");
        System.out.println(SB);


    }
}
