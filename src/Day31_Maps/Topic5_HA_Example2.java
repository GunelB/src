package Day31_Maps;

import java.util.HashMap;

public class Topic5_HA_Example2 {
    public static void main(String[] args) {
        /*
        Given a map of food keys and topping values,
        modify and return the map as follows:

        if the key "ice cream" is present, set its value to "cherry".
        In all cases, set the key "bread" to have the value "butter".
        topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        topping1({}) → {"bread": "butter"}
        topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
         */

        HashMap<String, String> MyMap = new HashMap<>();
        //{"ice cream": "peanuts"}
        MyMap.put("ice cream", "peanuts");

        System.out.println(topping1(MyMap));

        MyMap.clear();
        System.out.println(topping1(MyMap));

        MyMap.put("pancake", "syrup");
        System.out.println(topping1(MyMap));

    }

    //create a method
    // topping1
    // parameters 1-hashmap
    // returntype Hashmap

    public static HashMap<String,String> topping1(HashMap<String,String> p_MyMap){
        //if the key "ice cream" is present, set its value to "cherry".
        if (p_MyMap.containsKey("ice cream")){
            //replace
            //put
            p_MyMap.put("ice cream", "cherry");
        }


        //        In all cases, set the key "bread" to have the value "butter".
        p_MyMap.put("bread", "butter");

        return p_MyMap;
    }
}
