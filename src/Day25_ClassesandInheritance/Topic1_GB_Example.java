package Day25_ClassesandInheritance;

public class Topic1_GB_Example {
    /*
    create 2 students
    give them homeworks
    grade their homework
    check if they passed or not
     */
    public static void main(String[] args) {


    Students FirstStudent = new Students();
    FirstStudent.Name ="Henry";
    FirstStudent.Number ="1";
    FirstStudent.AddHomeworkResult(97);
    FirstStudent.AddHomeworkResult(100);

    Students SecondStudent = new Students();
    SecondStudent.Name = "Derya Bali";
    SecondStudent.Number = "152";
    SecondStudent.AddHomeworkResult(5);
    SecondStudent.AddHomeworkResult(17);
    SecondStudent.AddHomeworkResult(80);
    SecondStudent.AddHomeworkResult(70);
        System.out.println(FirstStudent.GetMean());

    }
}
