package Day20_MethodOverloadAndWrapperClass;

import java.util.ArrayList;

public class Topic5_HA_AccessElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>();
        /*
        at first the length is 0
        when you add a value
        First java needs to increase arraylist length in the memory
        it will add the value
         */

       RandomWords.add("mud");
       RandomWords.add("rice");
       RandomWords.add("elastic");
       RandomWords.add("Florida");

        System.out.println(RandomWords);

        String SecondWord = RandomWords.get(1);  // oldarray[1]
        System.out.println("SecondWord = " + SecondWord);

        // oldarray.length
        for (int i = 0; i < RandomWords.size(); i++) {
            System.out.println(RandomWords.get(i));  // oldarray[i]
        }

        System.out.println("While----------------------");

        int j = 0;
        while (j < RandomWords.size()){
            System.out.println(RandomWords.get(j));
            j++;
        }


        System.out.println("For Each---------------------");

        for (String word : RandomWords ){
            System.out.println(word);
        }
    }
}
