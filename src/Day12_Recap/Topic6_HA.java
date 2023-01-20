package Day12_Recap;

public class Topic6_HA {
    public static void main(String[] args) {
//Create a Java Program to Display Alphabets (A-a to Z-a) using loop
/*
A-a
B-b
C-c
D-d
.......
Z-z
 */
        for (int i = 65; i <=90 ; i++) {
            char MyUppercase = (char) i;  //<- A in the first iteration
            char MyLowercase = (char) (i+32); //a in the first iteration
            System.out.printf("%c-%c\n",MyUppercase,MyLowercase);
        }

    }
}
