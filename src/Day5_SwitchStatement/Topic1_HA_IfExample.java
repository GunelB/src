package Day5_SwitchStatement;

import java.util.Scanner;

public class Topic1_HA_IfExample {
    public static void main(String[] args) {
        /*
        Water Temp is 100 = it is boiling
        Water Temp is 0 = it is freezing
        Water Temp is 0<temp<10 = So Cold
        Water Temp between 10-30 = Cold
        Water Temp 60<temp<90 = Hot
        Water Temp 90<=temp<100 So Hot,
        rest Room Temp
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter water temperature");

        int Temp = scan.nextInt();

        //Water Temp is 100 = it is boiling
        if (Temp == 100){
            System.out.println("It is boiling");
        } else if (Temp == 0){  //Water Temp is 0 = it is freezing
            System.out.println("It is freezing");
        } else if ( 0<Temp && Temp<10 ){ //Water Temp is 0<temp<10 = So Cold
            System.out.println("So Cold");
        } else if (10<=Temp && Temp<=30){ // Water Temp between 10-30 = Cold
            System.out.println("Cold");
        } else if (60<Temp && Temp<90){ //Water Temp 60<temp<90 = Hot
            System.out.println("Hot");
        } else if (90<=Temp && Temp<100){ //Water Temp 90<=temp<100 So Hot,
            System.out.println("So Hot");
        } else if (Temp < 0 || Temp>100){
            System.out.println("Invalid temperature");
        }
        else {
            System.out.println("Room temperature");
        }





    }
}
