package Day31_Maps;

import java.util.TreeMap;

public class Topic3_HA_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> ModelYearsOfCars = new TreeMap<>();

        ModelYearsOfCars.put("Tesla", 2021);
        ModelYearsOfCars.put("Volkswagen", 2020);
        ModelYearsOfCars.put("Subaru", 2009);

        System.out.println(ModelYearsOfCars);

        System.out.println(ModelYearsOfCars.keySet());

        for (String key  : ModelYearsOfCars.keySet()){
            System.out.println("Key = "+key);

            System.out.println("Value = "+ModelYearsOfCars.get(key));
        }
    }
}
