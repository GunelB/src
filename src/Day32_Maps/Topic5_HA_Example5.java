package Day32_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Topic5_HA_Example5 {
    public static void main(String[] args) {
/*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast", "tuna"]) → {"s": "saltsoda", "t": "teatoasttuna"}
firstChar(["derya", "is", "drinking", "ice tea", "irishcoffee"]) →
{"d", "deryadrinking", "i", "isice teairishcoffee" }
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */

        //["derya", "is", "drinking", "ice tea", "irishcoffee"]

        ArrayList<String> MyList = new ArrayList<>();
        MyList.addAll(Arrays.asList("derya", "is", "drinking", "ice tea", "irishcoffee"));
        System.out.println(firstChar(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("salt", "tea", "soda", "toast", "tuna"));
        System.out.println(firstChar(MyList));

        MyList.clear();
        System.out.println(firstChar(MyList));
    }

    /*
    public static HashMap<String, String> firstChar (ArrayList<String> p_MyList){
        HashMap<String, String> ReturnMap = new HashMap<>();

        //"derya", "is", "drinking", "ice tea", "irishcoffee"
        for (String Word : p_MyList){
            // Word = "derya"
            // I need to get the first char
            char FirstChar = Word.charAt(0);  // Word.substring(0,1);
            // If you have it in the map, append to it
            // if you don't have it in the map just add it into map.

            if ( !ReturnMap.containsKey(Character.toString(FirstChar)) ){
                ReturnMap.put(Character.toString(FirstChar), Word);
                //String.valueOf(FirstChar)
                //Character.toString(FirstChar)
                //String FirstChar= ""+Word.charAt(0);
            } else {
                String CurrentValue = ReturnMap.get(Character.toString(FirstChar));
                String NewValue = CurrentValue + Word;
                ReturnMap.put(String.valueOf(FirstChar), NewValue);

            }

        }

        return ReturnMap;
    }
*/
    public static HashMap<String, String> firstChar (ArrayList<String> p_MyList){
        HashMap<String, String> ReturnMap = new HashMap<>();

        //"derya", "is", "drinking", "ice tea", "irishcoffee"
        for (String Word : p_MyList){
            // Word = "derya"
            // I need to get the first char
            String FirstChar = Word.substring(0,1);
            // If you have it in the map, append to it
            // if you don't have it in the map just add it into map.

            if ( !ReturnMap.containsKey(FirstChar) ){
                ReturnMap.put(FirstChar, Word);
            } else {
                String CurrentValue = ReturnMap.get(FirstChar);
                String NewValue = CurrentValue + Word;
                ReturnMap.put(FirstChar, NewValue);

            }

        }

        return ReturnMap;
    }
}
