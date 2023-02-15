package Day26_InheritanceandPolyMorphism;

public class Staff {
    private String Name;
    private String JobTitle;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public double CalculateWeeklyPay(){
        return 0;
    }


    // camelCase        <- weNeedMoney
    // PascalCase       <- WeNeedMoney
    // kebab-case       <- we-need-money
    // snake_case       <- we_need_money
}
