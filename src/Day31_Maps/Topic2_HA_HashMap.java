package Day31_Maps;

import java.util.HashMap;

public class Topic2_HA_HashMap {
    public static void main(String[] args) {
        // Key, Value

        HashMap<String, String> MyHashMap = new HashMap<>();

        // put(p_Key, p_Value) Inserts the key and the value into the map

        MyHashMap.put("Surname", "Bali");
        MyHashMap.put("Age", "18");
        MyHashMap.put("Salary", "90000");
        MyHashMap.put("Name", "Derya");
        MyHashMap.put("Country", "Japan");

        MyHashMap.put("Salary", "120000");
        // get(p_key) <- this will return the value of given key

        System.out.println("The name of the employee = "+MyHashMap.get("Name"));
        System.out.println("The age of the employee = "+MyHashMap.get("Age"));

        System.out.println(MyHashMap);
        System.out.println("*************");
        System.out.println(MyHashMap.get("CompanyName"));

        System.out.println(MyHashMap.getOrDefault("CompanyName", "Default Company"));

        System.out.println(MyHashMap.getOrDefault("Salary", "55000"));

        System.out.println(MyHashMap.containsKey("Age"));

        System.out.println(MyHashMap.containsKey("country"));

        System.out.println("*********************");

        System.out.println(MyHashMap.containsValue("Deria"));
        System.out.println(MyHashMap.containsValue("Derya"));

        MyHashMap.replace("Age", "33");

        System.out.println(MyHashMap.get("Age"));

        System.out.println(MyHashMap.replace("Desk", "B10"));

        System.out.println("*************");

        System.out.println(MyHashMap);

        MyHashMap.remove("Age");

        System.out.println(MyHashMap);

        MyHashMap.clear();
        System.out.println(MyHashMap);
        /*
        put(Key, Value) - Inserts the association of a key and a value into the map.
        If the key is already present, the new value replaces the old value.
        putIfAbsent(Key, Value) - Inserts the association if the key is not already associated with the value.
        putAll() - Inserts all the entries from the specified map to this map.
        get(Key) - Returns the value associated with the specified key. If the key is not found, it returns null.
        getOrDefault(Key, defaultValue) - Returns the value associated with the specified key.
        If the key is not found, it returns the defaultValue.
        containsKey(Key) - Checks if the specified key K is present in the map or not.
        containsValue(Value) - Checks if the specified value V is present in the map or not.
        replace(Key, Value) - Replace the value of the key K with the new specified value V.
        replace(Key, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
        remove(Key) - Removes the entry from the map represented by the key K.
        remove(Key, Value) - Removes the entry from the map that has key K associated with value V.
        keySet() - Returns a set of all the keys present in a map.
        values() - Returns a set of all the values present in a map.
        entrySet() - Returns a set of all the key/value mapping present in a map.
        put
        get
        getOrDefault
        containsKey
        replace
        remove
        keySet
         */


    }
}
