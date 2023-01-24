package Day14_Arrays;

import java.util.Arrays;

public class Topic4_GB_ArrayMethodsCont {
    public static void main(String[] args) {
        String[]Animals={"Dog","cat","horse","Lion"};
        System.out.println(Arrays.toString(Animals));
        Arrays.sort(Animals);
        System.out.println(Arrays.toString(Animals));
        //Arrays.toString
        //Arrays.sort
        //Array.equals(Array1,Array2));
        System.out.println("******");
        String[]Cars1 ={"Toyota","Jeep","Subaru"};
        String[]Cars2 ={"Jeep","Toyota","Subaru"};
        System.out.println(Arrays.equals(Cars1,Cars2));
        Arrays.sort(Cars1);
        Arrays.sort(Cars2);
        System.out.println("After Sort:" +Arrays.equals(Cars1, Cars2));;
    }
}
