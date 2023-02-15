package Day26_InheritanceandPolyMorphism;

public class SalaryStaff extends Staff{
    private double WeeklySalary;

    public double getWeeklySalary() {
        return WeeklySalary;
    }

    public void setWeeklySalary(double WeeklySalary) {
        this.WeeklySalary = WeeklySalary;
    }

    @Override
    public double CalculateWeeklyPay() {
        return WeeklySalary;
    }
}

