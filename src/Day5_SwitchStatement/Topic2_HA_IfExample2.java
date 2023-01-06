package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic2_HA_IfExample2 {
    public static void main(String[] args) {
        /*
        Telephone Bill
        Write a program to calculate the monthly telephone bills as per the following rule:
        Minimum $200 for up to 100 calls.
        Plus $0.60 per call for next 50 calls. (101-150)
        Plus $0.50 per call for next 50 calls. (151-200)
        Plus $0.40 per call for any call beyond 200 calls.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter call count");
        int Call = scan.nextInt();

        double BillAmount = 0;
        //Minimum $200 for up to 100 calls.
        if (Call <= 100){
            BillAmount = 200;
        } else if (Call> 100 && Call<=150 ){ //Plus $0.60 per call for next 50 calls. (101-150)
            BillAmount = 200 + (Call-100) * 0.6;

            //105 calls 200+ 5*0.6  Call-100
            //129 calls 200+ 29*0.6  Call-100
            //150 calls 200+ 50*0.6  Call-100
        }
        //Plus $0.50 per call for next 50 calls. (151-200)
        else if (Call >150 && Call<=200){
            BillAmount = 200+ 50 *0.6 + (Call-150) * 0.50;

         // 155 Calls   200+ 50 *0.6 + 5 * 0.50    Call-150
         // 188 Calls   200+ 50 *0.6 + 38* 0.50    Call-150
         // 200 Calls   200+ 50 *0.6 + 50* 0.50    Call-150
        }
        //Plus $0.40 per call for any call beyond 200 calls.
        else if (Call>200 ){
            BillAmount = 200+ 50*0.6 +50*0.5 + (Call-200) *0.4;
            // 205 calls    200+ 50*0.6 +50*0.5 + 5 *0.4  Call-200
            // 222 calls    200+ 50*0.6 +50*0.5 + 22*0.4  Call-200
        }

        System.out.println(BillAmount);
    }
}
