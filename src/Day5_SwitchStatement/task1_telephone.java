package Day5_SwitchStatement;

import java.util.Scanner;

public class task1_telephone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Call = scan.nextInt();
        double BillAmount = 0;
        if(Call <= 100) {
            BillAmount = 200;
        }else  if(Call >100 && Call <=150) {
            BillAmount = 200 + (Call - 100) * 0.6;
        } else if(Call >150 && Call <=200) {

            BillAmount = 200 + 50 * 0.6 + (Call - 150) * 0.50;
        } else if(Call >200){
            }


    }
}
