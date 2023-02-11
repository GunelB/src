package Day24_ClassesRecap;

public class Topic3_HA_Example3 {
    public static void main(String[] args) {
        /*
        d) Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”, and with the month “July”.
         */

        Holiday FirstHoliday = new Holiday("Independence Day", 4, "July");

        Holiday CanadaDay = new Holiday("Canada Day", 1, "July");

        System.out.println("InSameMonth = " + InSameMonth(FirstHoliday, CanadaDay));

        Holiday [] Holidays = { FirstHoliday, CanadaDay };

        System.out.println(AvgDate(Holidays));

/*
 The Java class called Holiday is started below.  An object of class Holiday represents a holiday during the year.  This class has three instance variables:
● name, which is a String representing the name of the holiday 
● day, which is an int representing the day of the month of the holiday 
● month, which is a String representing the month the holiday is in 

public class Holiday { 
	private String name; 
	private int day; 
	private String month;

	// your code goes here 
} 
a) Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.
b) Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value  true if they have the same month, and false if they do not.
c) Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that  is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries). 
d) Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”, and with the month “July”.
 */
    }

 /*
 b) Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value  true if they have the same month, and false if they do not.

 Create a method
 Parameters - 2 Parameters, Holiday
 ReturnType - Boolean
  */

   private static Boolean InSameMonth(Holiday p_Holiday1, Holiday p_Holiday2){
     /*
       if (p_Holiday1.GetMonth()  == p_Holiday2.GetMonth()){
         return true;
     }
     else {
         return false;
     }
     */
       return  p_Holiday1.GetMonth() == p_Holiday2.GetMonth();

   }

   /*
   c) Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that  is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).

   Create a method
   Parameters - 1  Holiday[]
   Return Type - Double
    */

    public static Double AvgDate (Holiday [] p_Holidays){
        // Total / length

        double Total = 0;
        for (Holiday MyHoliday : p_Holidays){
            Total = Total + MyHoliday.GetDay();
        }

        return Total / p_Holidays.length;
    }


}
