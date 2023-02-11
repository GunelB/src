package Day24_ClassesRecap;

public class Topic3_GB_Example3 {
    public static void main(String[] args) {
        GB_Holiday FirstHoliday=new GB_Holiday("Independence DAy",4,"July");
        GB_Holiday CanadaDAy=new GB_Holiday("Canada Day",1,"July");
        System.out.println(InSameMonth(FirstHoliday,CanadaDAy));
        /*
 TheJava class called Holiday is started below.  An object of class Holiday represents a holiday during the year.  This class has three instance variables:
● name, which is a String representing the name of the holiday
● day, which is an int representing the day of the month of the holiday
● month, which is a String representing the month the holiday is in

public class Holiday {
   private String name;
   private int day;
   private String month;

   // your code goes here
}
a) Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.
b) Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value  true if they have the same month, and false if they do not.
c) Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that  is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).
d) Write a piece of code that creates a Holiday instance with the name "Independence Day", with the day "4", and with the month "July".
 */
    }
    private static Boolean InSameMonth(GB_Holiday p_holiday1,GB_Holiday p_holiday2 ){
      //  if(p_holiday1.GetMonth()==p_holiday2.GetMonth()){

        return p_holiday1.GetMonth()==p_holiday2.GetMonth();         //advanced
    }
    public static Double AvgDate (GB_Holiday[]p_Holidays){
        //Total/length
        double Total=0;
        for (GB_Holiday MyHoliday : p_Holidays) {
            Total=Total+ MyHoliday.getDay();
            
        }
        return Total/ p_Holidays.length;

    }

}
