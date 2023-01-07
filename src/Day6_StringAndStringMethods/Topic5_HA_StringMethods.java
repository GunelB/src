package Day6_StringAndStringMethods;

public class Topic5_HA_StringMethods {
    public static void main(String[] args) {
             /*
Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String
startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String
     */

        String s = "I'm a lazy person";
        String s2 = "Elizabeth Rebecca";

//charAt()	          Returns the character at the specified index (position)	        char
//        "Elizabeth Rebecca"
//         0123456789
   //new Scanner(System.in);
        System.out.println(s2.charAt(10));
        System.out.println(s2.charAt(5));
        System.out.println(s2.charAt(9));

//concat()	          Appends a string to the end of another string	                    String
        String s3 = "Real";
        String s4 = "Madrid";

        System.out.println(s3.concat(s4));  // s3+s4

//contains()	          Checks whether a string contains a sequence of characters	        boolean
        String s5 = "Java";
        boolean IsItContainsJ = s5.contains("K");
        System.out.println(IsItContainsJ);

//endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
        String s6 = "I'm a lazy person1";
        boolean IsItEndsWithSon = s6.endsWith("rson1");
        System.out.println("IsItEndsWithSon = " + IsItEndsWithSon);

//startsWith()	      Checks whether a string starts with specified characters	        boolean

        boolean IsItStartingWithI = s6.startsWith("I'm a lazy");
        System.out.println("IsItStartingWithI = " + IsItStartingWithI);

//equals()	          Compares two strings. Returns true if the strings are equal,
//                      and false if not	                                                boolean

        String cat1 = "cat";
        String cat2 = new String("cat");

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

//equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
        System.out.println(cat1.equalsIgnoreCase(cat2));

//indexOf()	          Returns the position of the first found occurrence
//                      of specified characters in a string	                            int

        String City = "Toronto-Ontario Canada";
                     //0123456789
        //Name;Surname;Age-City+
        //Hayri
        //Rebecca

        System.out.println(City.indexOf("on"));
        int position = City.indexOf(" ");
        System.out.println("position = " + position);
        

//isEmpty()	          Checks whether a string is empty or not	                        boolean
        
        String e = "";
        boolean IsItEmpty = e.isEmpty();
        System.out.println("IsItEmpty = " + IsItEmpty);

//lastIndexOf()	      Returns the position of the last found occurrence of
//                      specified characters in a string	                                int

        String Country = "United States of America";
        System.out.println(Country.indexOf("e"));
        System.out.println(Country.lastIndexOf("e"));
    }
}
