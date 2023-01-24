package Day14_Arrays;

import java.util.Arrays;

public class Topic6_GB_StringMethodsAndArray {
    public static void main(String[] args) {
        String s= "Canada is awesome";
        //{Canada,is,awesome"}

        String[] MyArray =s.split(" ");
      String MySentence= "Java is cool";
        System.out.println(Arrays.toString(MyArray));
        String[] MySentenceArray = MySentence.split(" ");

    }
}
