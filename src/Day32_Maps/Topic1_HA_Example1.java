package Day32_Maps;

import java.util.HashMap;

public class Topic1_HA_Example1 {
    public static void main(String[] args) {
/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */

        //{"a": "Hi", "b": "There"}
        //DataType VariableName = new DataType();
        HashMap<String, String> MyMap = new HashMap<>();
        MyMap.put("a", "Hi");
        MyMap.put("b", "There");

        System.out.println(mapAB(MyMap));

        MyMap.clear();
        //{"a": "Hi"}
        MyMap.put("a", "Hi");
        System.out.println(mapAB(MyMap));

        MyMap.clear();
        //{"b": "There"}
        MyMap.put("b", "There");
        System.out.println(mapAB(MyMap));


    }

    // mapAB
    // Parameters - 1 HashMap<String,String>
    // returntype HashMap<String,String>

    //PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName(Param1Type Param1Name,....)

    public static HashMap<String,String> mapAB(HashMap<String,String> p_MyMap){
       /*
       for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
        */

        //If both keys are present
        if( p_MyMap.containsKey("a") && p_MyMap.containsKey("b")){
            //append their 2 string values together
            String AppendedValues = p_MyMap.get("a") + p_MyMap.get("b");
            //store the result under the key "ab".
            p_MyMap.put("ab", AppendedValues);
        }

        //Modify and return the given map as follows
        return p_MyMap;
    }
}
