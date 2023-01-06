package Day5_SwitchStatement;

public class Topic6_HA_TernaryOperator {
    public static void main(String[] args) {
        int Number1 = 44;
        int Number2 = 22;
        int Max;

        if(Number1 > Number2){
            Max = Number1;
            System.out.println("The maximum number is "+Number1);
        } else {
            Max = Number2;
            System.out.println("The maximum number is "+Number2);
        }

        //  (condition) ? The code if it is true : The code if it false;
        Max = (Number1 > Number2) ? Number1 : Number2;
        System.out.println(Max);
    }
}
