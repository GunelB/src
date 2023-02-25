package Day31_Maps;

import java.util.HashMap;

public class Topic4_HA_Example1 {
    public static void main(String[] args) {
        /*
        Modify and return the given map as follows:
        if the key "a" has a value,
         set the key "b" to have that value,
        and set the key "a" to have the value "".
        Basically "b" is a bully, taking the value and replacing it with the empty string.

        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

        mapBully({"b": "candy"}) → {"b": "candy"}
         */

        //https://codingbat.com/java/Map-1
        HashMap<String, String> MyHashMap = new HashMap<>();
        //{"a": "candy", "b": "dirt"}
        // put(p_Key, p_Value)
        MyHashMap.put("a", "candy");
        MyHashMap.put("b", "dirt");

        mapBully(MyHashMap);

        MyHashMap.clear();
        //{"a": "candy"}
        MyHashMap.put("a", "candy");
        mapBully(MyHashMap);

        MyHashMap.clear();
        //{"a": "candy", "b": "carrot", "c": "meh"}
        MyHashMap.put("a", "candy");
        MyHashMap.put("b", "carrot");
        MyHashMap.put("c", "meh");
        mapBully(MyHashMap);

        MyHashMap.clear();
        MyHashMap.put("b", "candy");
        mapBully(MyHashMap);
    }

    // create a method header
    // mapBully
    // Parameters  1- HashMap
    // return void
    public static void mapBully(HashMap<String, String> p_MyMap){
        /*
         if the key "a" has a value,
         set the key "b" to have that value,
        and set the key "a" to have the value "".
         */

        if(p_MyMap.containsKey("a")){
            //set the key "b" to have that value,
            //        and set the key "a" to have the value "".
            p_MyMap.put("b", p_MyMap.get("a"));
            p_MyMap.put("a", "");
        }
        System.out.println(p_MyMap);
    }
}
