package Homeworks;

import java.util.Scanner;

public class Homework_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day ");
        int day = scan.nextInt();
        GoToWorkOrToSleep(day);
    }
    // Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on) and it returns a String v
    // Please create a method that takes one integer parameter and returning a String.
    // Name your Method as (GotoSleeporWork)
    // Based on your parameter, if you are in weekdays, return "Go To Work" otherwise //return "Go Back to Sleep".
    public static String GoToWorkOrToSleep(int p_day) {
        String end = "";
        if (p_day <= 5) {
            end = "Go to Work";
        } else {
            end = "Time to sleep";
        }
        System.out.println(end);
       return end;

    }
}

