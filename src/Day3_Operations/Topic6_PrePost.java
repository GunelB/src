package Day3_Operations;

public class Topic6_PrePost {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("i = " + i);

        i = i + 1;

        System.out.println("i = " + i);

        i = i + 1;

        System.out.println("i = " + i);

        i += 1;
        // i = i + 1; this is the same code with above
        System.out.println("i = " + i);

        i++;
        // i= i+1; this is the same code with above
        System.out.println("i = " + i);

        int AValue = 20;
        AValue++;
        System.out.println("AValue = " + AValue);

        // i++ <- increase the value by 1;

        AValue--;
        System.out.println("AValue = " + AValue);
        // i-- <- decrease the value by 1;

        double ADoubleNumber = 3.3;
        ADoubleNumber--;
        System.out.println("ADoubleNumber = " + ADoubleNumber);

        int j = 5;
        int k = j++;  // <- k = j; j=j+1;
        System.out.println("k = " + k);
        System.out.println("j = " + j);

        int o = ++j; // j=j+1; o =j;


        int Number = 10;
        System.out.println("Number = " + Number);
        System.out.println(Number++); // print Number; Number = Number+1;
        System.out.println(Number);
        System.out.println(Number++); // print Number; Number = Number +1;
        System.out.println(Number);
        System.out.println(Number++);
        System.out.println("*****************");

        //Number++     ++Number   they are not same
        // number++    first do what you want, when you finish increase the value
        // ++number    first increase the number, then do whatever you want

        Number = 20;
        System.out.println(++Number); // First increase it Number = Number+1; Print Number
        System.out.println(--Number); // First decrease it Number = Number-1; Print Number

    }
}
