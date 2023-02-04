package Day20_MethodOverloadAndWrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
public class Topic6_GB_ChangeElement {
    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>();

        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("Florida");
        System.out.println(RandomWords);
        RandomWords.set(3,"Toronto");
        System.out.println("RandomWords = " + RandomWords);
        RandomWords.set(1, "Bulgur");
    }
}
