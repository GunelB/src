package Day26_InheritanceandPolyMorphism;

public class GB_SalaryClass {
    private double WeeklySalary;
    public double getWeeklySalary(){
        return WeeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
       this.WeeklySalary  = weeklySalary;
    }
  //  @Override
     public double  CalculateWeeklyPay(){
        return WeeklySalary;
    }
}
