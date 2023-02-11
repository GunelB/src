package Day24_ClassesRecap;

public class Holiday {
    private String Name;
    private int Day;
    private String Month;

/*
a) Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.
 */

    public Holiday(String p_Name, int p_Day, String p_Month){
        Name = p_Name;
        Day = p_Day;
        Month = p_Month;
    }

    public String GetMonth(){
        return Month;
    }

    public int GetDay(){
        return Day;
    }
}
