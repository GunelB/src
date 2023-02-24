package Day30_CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;

public class Topic1_HA_HashSet {
    public static void main(String[] args) {
        // DataType VariableName = new DataType();

        HashSet<String> MyMotors = new HashSet<>();

        MyMotors.add("Suzuki");
        MyMotors.add("Kawasaki");
        MyMotors.add("Honda");
        MyMotors.add("Suzuki"); // 2nd Suzuki
        MyMotors.add("Yamaha");
        MyMotors.add("Honda"); // 2nd Honda
        MyMotors.add("Ducati");
        MyMotors.add(null);

        System.out.println(MyMotors);

        HashSet<Integer> MyIntegers = new HashSet<>();
        MyIntegers.addAll(Arrays.asList(11,5,1,5));

        System.out.println(MyIntegers);

    }
}
