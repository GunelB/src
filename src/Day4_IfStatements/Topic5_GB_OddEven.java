package Day4_IfStatements;

public class Topic5_GB_OddEven {
    public static void main(String[] args) {
        int Number = 9;
        int Remainder = Number % 2;
        System.out.println("Remainder = " + Remainder);
        //odd numb 1 3 5 7 9
        if (Remainder ==1){
            System.out.println(Number+"is an odd number!");

        }else {
            System.out.println(Number+"is an even number!");
        }
    }
}
