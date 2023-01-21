package Homeworks;

public class Random_1 {
    public static void main(String[] args) {
        String Input ="Code";
        String Reverse ="";
        for (int i =Input.length()-1; i>=0; i--) {
            Reverse=Reverse+Input.charAt(i);
            System.out.println(Reverse);
        }

    }


    }

    /*public class Homework_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equals(word)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
     */

//  task8
//  Given a string, return a new string where the first and last chars have been exchanged.
//   frontBack("code") → "eodc"
//  frontBack("a") → "a"
//  frontBack("ab") → "ba"


