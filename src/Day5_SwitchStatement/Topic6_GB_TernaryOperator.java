package Day5_SwitchStatement;

public class Topic6_GB_TernaryOperator {
    public static void main(String[] args) {
        int Number1 = 44;
        int Number2 = 55;

        if(Number1 > Number2){
            System.out.println("Max number is" +Number1);
        }else {
            System.out.println("The max numb is" +Number2);
        }
        //(condition) ? The code if it is true: the code if it false;
          int Max = (Number1 > Number2)? Number1 : Number2;
        System.out.println(Max);
    }
}
