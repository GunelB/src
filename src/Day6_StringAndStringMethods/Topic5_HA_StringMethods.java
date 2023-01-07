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


    }
}
