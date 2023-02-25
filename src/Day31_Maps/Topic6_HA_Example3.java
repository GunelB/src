package Day31_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Topic6_HA_Example3 {
    public static void main(String[] args) {
/*
        Given an array of strings,
        return a Map<String, Boolean>

        where each different string is a key and its value is true if that string appears 2 or more times in the array.

        wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        wordMultiple(["c", "c", "c", "c"]) → {"c": true}
         */

        ArrayList<String> MyLetters = new ArrayList<>();
        //["a", "b", "a", "c", "b"]
        /*
        MyLetters.add("a");
        MyLetters.add("b");
        MyLetters.add("a");
        MyLetters.add("c");
        MyLetters.add("b");
         */
        MyLetters.addAll(Arrays.asList("a", "b", "a", "c", "b"));
        System.out.println(wordMultiple(MyLetters));

        //["c", "b", "a"]
        MyLetters.clear();
        MyLetters.addAll(Arrays.asList("c","b","a"));

        System.out.println(wordMultiple(MyLetters));


        //["c", "c", "c", "c"]
        MyLetters.clear();
        MyLetters.addAll(Arrays.asList("c","c","c","c"));

        System.out.println(wordMultiple(MyLetters));


    }

    //create a method
    //wordMultiple
    // parameters 1- ArrayList
    // ReturnType TreeMap<String, Boolean>

    public static TreeMap<String, Boolean> wordMultiple(ArrayList<String> p_Letters){
        TreeMap<String, Boolean> ReturnValue = new TreeMap<>();

        // where each different string is a key and its value is true if that string appears 2 or more times in the array.
        //["a", "b", "a", "c", "b"]
        for (String value : p_Letters ){
            // value = "a"
            if (Collections.frequency(p_Letters, value)>=2){
                ReturnValue.put(value, true);
            }
            else{
                ReturnValue.put(value, false);
            }
        }

        //{"a": true, "b": true, "c": false}
        return ReturnValue;
    }
}
