package Day24_ClassesRecap;

public class Employee2 {
    //salary, number of hours of work per day
    String Name;
    double Salary;
    int NumberOfHours;

    //1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter

    // PublicPrivateProtectedDefault StaticorNot ReturnType MethodName
    public void GetInfo(double p_Salary, int p_NumberOfHours ){
        Salary = p_Salary;
        NumberOfHours = p_NumberOfHours;
    }

    //2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.

    public void AddSal (){
        if (Salary < 500){
            Salary = Salary + 10;
//            Salary += 10;  this code is same with above
        }
    }
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

    public void AddWork (){
        if ( NumberOfHours > 6 ){
            Salary = Salary + 5;
        }
    }

}
