package Day32_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Topic4_HA_Example4 {
    public static void main(String[] args) {
/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
wordLen(["I", "love", "Canada"]) → {"I": 1, "love": 4, "Canada": 6 }
 */

        ArrayList<String> MyList = new ArrayList<>();
        MyList.addAll(Arrays.asList("I", "love", "Canada"));

        System.out.println(wordLen(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("code", "code", "code", "bug"));

        System.out.println(wordLen(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("this", "and", "that", "and"));
        System.out.println(wordLen(MyList));

        MyList.clear();
        MyList.addAll(Arrays.asList("a", "bb", "a", "bb"));

        System.out.println(wordLen(MyList));
    }
    public static HashMap<String, Integer> wordLen(ArrayList<String> p_MyList){
        HashMap<String, Integer> ReturnMap = new HashMap<>();
//["I", "love", "Canada"]
        for (String Word : p_MyList){
            ReturnMap.put(Word, Word.length());
        }

        return ReturnMap;
    }



}
