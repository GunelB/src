package Day32_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Topic6_HA_Example6 {
    public static void main(String[] args) {
/*

Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "b"]) → "ab"
wordAppend(["a", "b", "a", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a", "d"]) → "aad"
wordAppend(["a", "", "a"]) → "a"
 */
        ArrayList<String> MyList = new ArrayList<>();
        MyList.addAll(Arrays.asList("a", "b", "a"));
        System.out.println(wordAppend(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("a", "b", "a", "b"));
        System.out.println(wordAppend(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("a", "b", "a", "a"));
        System.out.println(wordAppend(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("a", "b", "a", "c", "a", "d", "a", "d"));
        System.out.println(wordAppend(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("a", " ", " ", "a"));  //  " a"    "a "
        System.out.println(wordAppend(MyList));
    }

    public static String wordAppend(ArrayList<String> p_MyList){
        HashMap<String, Integer> MyMap = new HashMap<>();
        String ReturnValue = "";
        for (String Letter : p_MyList ){
            // When I see it in the first time, I'll add it into a map
            // Everytime when I see it, I need to increase the count of it
            // check if it is even, I'll add the Letter in to the result

            if ( !MyMap.containsKey(Letter) ){
                MyMap.put(Letter, 1);
            } else {
                int CurrentCount = MyMap.get(Letter);
                CurrentCount++;
                MyMap.put(Letter, CurrentCount);

                if (CurrentCount % 2 == 0){
                    ReturnValue = ReturnValue + Letter;
                }
            }

        }
        return ReturnValue;
    }
}
