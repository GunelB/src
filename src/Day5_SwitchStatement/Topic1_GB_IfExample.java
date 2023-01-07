package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic1_GB_IfExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter water temperature");
        int Temp = scan.nextInt();

        if (Temp == 100) {
            System.out.println("It is boiling");
        }else if (Temp == 0) {
                System.out.println("It is freezing");
            }else if ( 0< Temp && Temp <10 ){
                System.out.println("It is so cold");
            }else if (10<=Temp && Temp <= 30) {
                System.out.println("It is cold");
            }else if (60<=Temp && Temp<=90) {
                System.out.println("It is Hot");
            }
                
            }
            }






