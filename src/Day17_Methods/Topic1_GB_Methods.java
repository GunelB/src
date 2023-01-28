package Day17_Methods;

public class Topic1_GB_Methods {
    public static void main(String[] args) {
        // Write a method where it takes array of integers and print the sum of all the elements in the
        // array
        int[] Numbers = {77,12,55,9,-9};
        SumArray(Numbers);
    }

    public static void SumArray(int []MyArray ){
        int Total=0;
        for (int i = 0; i < MyArray.length; i++) {
           Total = Total+ MyArray[i];
        }
        System.out.println("Total = " + Total);
    }
}
