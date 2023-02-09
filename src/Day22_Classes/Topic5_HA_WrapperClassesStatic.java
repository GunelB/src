package Day22_Classes;

public class Topic5_HA_WrapperClassesStatic {
    public static void main(String[] args) {
        /*
        Integer MyInt = new Integer(5);

        String MyString = MyInt.toString();
         */

        // To convert our String to integer
        System.out.println(Integer.parseInt("5") * 4 );

        Integer.toString(77);



        /*
        Auto Boxing
        UnBoxing
         */

        int r = 5;
        Integer t = new Integer(75);

        Integer t2 = 75;   //<- Auto-Boxing

        String s1 = new String("Something");
        String s2 = "Something";  //<- Auto-Boxing

//        int old = t2.intValue();
        int old = t2;  // UnBoxing
    }
}
