package Day26_InheritanceandPolyMorphism;

public class Topic2_HA_InheritanceExample2 {
    public static void main(String[] args) {
/*
Design a class hierarchy rooted in the class Staff that includes subclasses for HourlyStaff and SalaryStaff.
The attributes shared in common by these classes include the name, and job title of the employee, plus the getter and setter methods needed by those attributes.
The salaried employees need an attribute for weekly salary, and the corresponding methods for accessing and changing this variable.
The hourly employees should have a pay rate and an hours worked variable.
There should be a method called calculateWeeklyPay(), defined in the superclass and implemented in the subclasses.
The salaried worker's pay is just the weekly salary. Pay for an hourly employee is simply hours worked times pay rate.
 */

        HourlyStaff Serhat = new HourlyStaff();
        Serhat.setName("Serhat");
        Serhat.setJobTitle("QA Tester");
        Serhat.PayRate = 40;
        Serhat.HoursWorked = 40;

        System.out.println("Serhat's weekly salary = " + Serhat.CalculateWeeklyPay());

        SalaryStaff Derya = new SalaryStaff();
        Derya.setName("Derya Bali");
        Derya.setJobTitle("Comedian");
        Derya.setWeeklySalary(100);

        System.out.println("Derya's weekly salary = "+Derya.CalculateWeeklyPay());


    }
}
