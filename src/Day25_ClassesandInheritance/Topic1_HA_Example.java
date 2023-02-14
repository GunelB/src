package Day25_ClassesandInheritance;

public class Topic1_HA_Example {

    /*
    lets create 2 Students
    We will give them some homeworks
    we will grade their homeworks
    we will check if they passed or not
     */

    public static void main(String[] args) {
        Student FirstStudent = new Student();
        FirstStudent.Name = "Henry";
        FirstStudent.Number = "1";

        FirstStudent.AddHomeworkResult(97);
        FirstStudent.AddHomeworkResult(88);
        FirstStudent.AddHomeworkResult(85);
        FirstStudent.AddHomeworkResult(99);
        FirstStudent.AddHomeworkResult(100);

        Student SecondStudent = new Student();
        SecondStudent.Name = "Derya Bali";
        SecondStudent.Number = "152";

        SecondStudent.AddHomeworkResult(5);
        SecondStudent.AddHomeworkResult(17);
        SecondStudent.AddHomeworkResult(80);
        SecondStudent.AddHomeworkResult(2);

        System.out.println(FirstStudent.Name+" "+FirstStudent.GetMean());
        System.out.println(SecondStudent.Name+" "+SecondStudent.GetMean());
        if (FirstStudent.GetMean() >= 70){
            System.out.println(FirstStudent.Name+" Passed!");
        } else {
            System.out.println(FirstStudent.Name+" Failed!");
        }

        if (SecondStudent.GetMean() >= 70){
            System.out.println(SecondStudent.Name+" Passed!");
        } else {
            System.out.println(SecondStudent.Name+" Failed!");
        }


    }
}
