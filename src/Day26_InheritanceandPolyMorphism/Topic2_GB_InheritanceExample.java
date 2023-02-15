package Day26_InheritanceandPolyMorphism;

public class Topic2_GB_InheritanceExample {
    public static void main(String[] args) {
            HourlyStaff_GB Serhat = new HourlyStaff_GB();
            Serhat.getName("Serhat");
            Serhat.setJobTitle("QATester");
            Serhat.PayRate =40;
            Serhat.HoursWorked = 40;
        System.out.println("Serhat's salary" + Serhat.CalculateWeeklyPay());

    }
}
