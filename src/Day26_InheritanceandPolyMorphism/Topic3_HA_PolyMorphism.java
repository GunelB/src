package Day26_InheritanceandPolyMorphism;

import java.util.ArrayList;

public class Topic3_HA_PolyMorphism {
    public static void main(String[] args) {
        HourlyStaff Staff1 = new HourlyStaff();
        Staff1.HoursWorked = 35;
        Staff1.PayRate = 60;

        HourlyStaff Staff2 = new HourlyStaff();
        Staff2.HoursWorked = 20;
        Staff2.PayRate = 40;

        SalaryStaff Staff3 = new SalaryStaff();
        Staff3.setWeeklySalary(900);


        ArrayList<Staff> MyCompany = new ArrayList<>();
        MyCompany.add(Staff1);
        MyCompany.add(Staff2);
        MyCompany.add(Staff3);

        for (Staff aStaff : MyCompany ){
            System.out.println(aStaff.CalculateWeeklyPay());
        }

        /*
        Polymorphism means "many forms"
        In Java, polymorphism means same object performing different operations according to requirement.
        (in Java all classes inherited from Object)
        in other words polymorphism is simply the ability of an object to specialize its behaviour based on its type.

        how can we achieve polymorphism?

        method overriding
        method overloading

         */

    }
}


// class Integer extends Object {}
// class int extends Object{}   <- this is not true
// is java 100% pure Object oriented programming language?
// NO, because we have primitive data types
