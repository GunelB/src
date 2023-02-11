package Day24_ClassesRecap;

public class Employee2 {
  /*  Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */
    String Name;
    double Salary;
    int NumberOfHours;
    public void GetInfo(double p_Salary,int p_NumberOfHours){
        Salary =p_Salary;
        NumberOfHours=p_NumberOfHours;

    }
    public void AddSal() {
        if (Salary < 500) {
            Salary = Salary + 10;
        }
    }
    public void AddWork(){
        if(NumberOfHours > 6){
            Salary=Salary+5;
        }
    }
}

