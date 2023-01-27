package Day15_ArraysandForEach;

public class Topic4_GB_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] Numbers = {55,99,33,64};
        //this is 1-D array
        //2-D array
        int[][] Numbers2D ={ {55,99,33,64},{78,89,23,11}  };
        System.out.println(Numbers2D[1][3]); // if I want to get 11(second field is 1 and 11 is 3)

        //3- D Array
        String[][][] String3D={ {{"Array1-item1","Array2-item2"}},{{"Array1-item1","Array2-item2"}},{{"Array1-item1","Array2-item1",}}};
    }
}
