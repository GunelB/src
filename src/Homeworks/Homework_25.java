package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_25 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees
       Scanner scan=new Scanner(System.in);
       int[]EmployeeSalaries= new int[5];
       double total=0;
       double average =0;
        for (int i = 0; i <EmployeeSalaries.length ; i++) {
            System.out.println("Enter salary");
            EmployeeSalaries[i]= scan.nextInt();
             total=total+EmployeeSalaries[i];
        }
             average=total/EmployeeSalaries.length;
            Arrays.sort(EmployeeSalaries);
            System.out.println(Arrays.toString(EmployeeSalaries));
            System.out.println("Average salary for 5 employees = " + average);


      //  System.out.println("Enter");



}
}