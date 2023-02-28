package Day32_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Topic3_HA_Example3{
    public static void main(String[] args) {
/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
wordCount(["d", "e", "r", "y", "a"]) → {"d": 1, "e": 1, "r":1, "y":1, "a":1}
wordCount(["p", "o", "o", "r"]) → {"p": 1, "o": 2, "r": 1}

  //["d", "e", "r", "y", "a"]

 */
        ArrayList<String> MyList = new ArrayList<>();
        MyList.addAll(Arrays.asList("d", "e", "r", "y", "a"));
        System.out.println(wordCount(MyList));

        //["p", "o", "o", "r"]
        MyList.clear();
        MyList.addAll(Arrays.asList("p", "o", "o", "r"));
        System.out.println(wordCount(MyList));

        //"c", "c", "c", "c"
        MyList.clear();
        MyList.addAll(Arrays.asList("c", "c", "c", "c"));
        System.out.println(wordCount(MyList));
    }

    public static HashMap<String, Integer> wordCount (ArrayList<String> p_MyList){
        // Collections.frequency()
        //"a", "b", "a", "c", "b"

        HashMap<String, Integer> ReturnMap = new HashMap<>();

        for (int i = 0; i < p_MyList.size(); i++) {
            String MyValue = p_MyList.get(i);
            /*
            when I see the value in the first time, I need to add it into the return map
            when I see the value next time, I need to increase the count of the value in the map
             */

            if (!ReturnMap.containsKey(MyValue)){ // I didn't see you before
                ReturnMap.put(MyValue, 1);
            } else { // I saw you before
                int CurrentCount = ReturnMap.get(MyValue);
                CurrentCount++;
                ReturnMap.put(MyValue, CurrentCount);
            }
        }
        /* this for each loop is same with above for loop
        for (String MyValue : p_MyList){

        }
         */
    return ReturnMap;
    }
}
