package Day32_Maps;

import java.util.HashMap;

public class Topic2_HA_Example2 {
    public static void main(String[] args) {
/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
mapAB3({"c": "cake"}) → {"c": "cake"}
 */
        HashMap<String, String> MyMap = new HashMap<>();
        //{"a": "aaa", "c": "cake"}
        MyMap.put("a", "aaa");
        MyMap.put("c", "cake");

        System.out.println(mapAB3(MyMap));

        //{"b": "bbb", "c": "cake"}
        MyMap.clear();
        MyMap.put("b", "bbb");
        MyMap.put("c", "cake");

        System.out.println(mapAB3(MyMap));

        //{"a": "aaa", "b": "bbb", "c": "cake"}
        MyMap.put("a", "aaa");

        System.out.println(mapAB3(MyMap));

        //{"c": "cake"}
        MyMap.clear();
        MyMap.put("c", "cake");
        System.out.println(mapAB3(MyMap));
    }

    public static HashMap<String, String> mapAB3 (HashMap<String, String> p_MyMap){
        /*
        if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
         */

        // We have "a" but we don't have "b"
        //  p_MyMap.containsKey("a")  <- p_MyMap.containsKey("a") == true
        // !p_MyMap.containsKey("b")  <- p_MyMap.containsKey("b") == false
        if ( p_MyMap.containsKey("a") && !p_MyMap.containsKey("b")  ){
            //set the other to have that same value in the map.
            String ValueOfA = p_MyMap.get("a");
            p_MyMap.put("b", ValueOfA);
        } else if ( !p_MyMap.containsKey("a") && p_MyMap.containsKey("b") ) {
            // We don't have "a" but we have "b"
            //set the other to have that same value in the map.
            p_MyMap.put("a", p_MyMap.get("b"));
        }

        return p_MyMap;
    }
}
