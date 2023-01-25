package Day15_ArraysandForEach;

public class Topic2_GB_Example {
    public static void main(String[] args) {
        //Given an array of ints length 3, return a new array with the elements in reverse order, so //{1, 2, 3} becomes {3, 2, 1}.
        //I wiil make array
        //I need empty array
        //the first array iterate -downwards

        int[] Array1 ={1,2,3};
        //need empty array
        //datatype[]Variable = new Datatype[length]

        int[]Array2=new int[Array1.length];          //equal array3
        //need to iterate downwards
        for (int i = Array1.length-1; i >=0 ; i--) {
            Array2[Array1.length-1-i] = Array1[i]; // i=2
            //Array2[1] = Array1[1]; // i=1
            //Array2[2] = Array1[0]; // i=0

        }
    }
}
