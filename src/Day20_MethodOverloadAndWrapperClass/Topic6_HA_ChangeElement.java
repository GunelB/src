package Day20_MethodOverloadAndWrapperClass;

import java.util.ArrayList;

public class Topic6_HA_ChangeElement {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>();

        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("Florida");

        System.out.println(RandomWords);

        RandomWords.set(3,"Toronto");  //oldarray[3] = "Toronto"

        System.out.println("RandomWords = " + RandomWords);

        RandomWords.set(1,"Bulgur");  //oldarray[1] = "Bulgur"
        System.out.println("RandomWords = " + RandomWords);

        int IndexOfElastic = RandomWords.indexOf("elastic");
        System.out.println("IndexOfElastic = " + IndexOfElastic);

        // 0 1 2 3 ......
        int IndexOfHayri = RandomWords.indexOf("Hayri");
        System.out.println("IndexOfHayri = " + IndexOfHayri);

        System.out.println(RandomWords.indexOf("ABBY"));

        for (int i = 0; i < RandomWords.size(); i++) {
            if (i < RandomWords.size()-1) {
                System.out.print(RandomWords.get(i) + ", ");
            }else {
                System.out.println(RandomWords.get(i));
            }
        }

        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("Bulgur");
        System.out.println("DoWeHaveBulgurInArrayList = " + DoWeHaveBulgurInArrayList);

        System.out.println(RandomWords.contains("Chocolate"));

        System.out.println("RandomWords = " + RandomWords);
        RandomWords.set(RandomWords.indexOf("elastic"), "Chocolate");
        System.out.println("RandomWords = " + RandomWords);
        System.out.println(RandomWords.contains("Chocolate"));


        // below line will throw an exception because index of Becky is equals -1
        // and we don't have index -1 in our arraylist
        //RandomWords.set(RandomWords.indexOf("Becky"), "Elizabeth");

    }
}
