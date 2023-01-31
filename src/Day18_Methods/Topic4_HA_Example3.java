package Day18_Methods;

public class Topic4_HA_Example3 {

    public static void main(String[] args) {
/*
Missing Number
{6,1,2,8,3,4,7,10,5}
Output: 9

{1,2,3,4,5,6,7,8,10}

1 - yes
2 - yes
3 - yes
4 - yes
5 - yes
6 - yes
7 - yes
8 - yes
9 - no


{7,5,1,3,4,6}
Output 2
Length = 6
{1,3,4,5,6,7}
1 - yes
2 - no
3 - yes
4 - yes
5 - yes
6 - yes


{7,5,1,3,4,2}
{1,2,3,4,5,6}
1 - yes
2 - yes
3 - yes
4 - yes
5 - yes
6 - no

 */

        /*
        I need to create an int array = {6,1,2,8,3,4,7,10,5}
        I need to check all elements in the array
        if I don't have the element stop and return output
         */

        int[] MyArray = {6,1,2,8,3,4,7,10,5};

        for (int i = 1; i <= MyArray.length ; i++) {
            int TheNumberImlookingfor = i;  // i=1
            boolean DoIHaveTheNumberInTheArray = CheckSpecificValue(MyArray,TheNumberImlookingfor);

            if (DoIHaveTheNumberInTheArray == false){
                System.out.println("Output : "+TheNumberImlookingfor);
            }

        }
    }

    // create a method
    // in this method I will check if an array have a specific value
    // Parameters 2. int[] Array, int specific value
    // ReturnType boolean

    public static boolean CheckSpecificValue (int[] Array1, int SpecificValue){
        // in this method I will check if an array have a specific value
        // I need to check each element in the array to see is it equal to specific value
        boolean ReturnValue = false;
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] == SpecificValue){
                ReturnValue = true;
            }
        }
        return ReturnValue;
    }
}
