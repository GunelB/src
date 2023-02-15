package Day26_InheritanceandPolyMorphism;

public class HourlyStaff extends Staff{
    double PayRate;
    int HoursWorked;

    @Override
    public double CalculateWeeklyPay() {
        return HoursWorked * PayRate;
    }
}
