package Day19_Methods;

import java.util.Scanner;

public class Topic4_HA_Example3 {
    public static void main(String[] args) {
/*
Create a method which simulates the game "rock, paper, scissors". The method takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
Rock beats scissors, paper beats rock, scissors beat paper.

Examples:

rps("rock", "paper") ➞ "Player 2 wins"

rps("paper", "rock") ➞ "Player 1 wins"

rps("paper", "scissors") ➞ "Player 2 wins"

rps("scissors", "scissors") ➞ "TIE"

rps("scissors", "paper") ➞ "Player 1 wins"
 */

        /*
        I need to create a method
        parameters 2 String Parameters
        returntype void
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Player 1's move : ");
        String Player1 = scan.next();

        System.out.println("Please enter Player 2's move : ");
        String Player2 = scan.next();

        rps(Player1, Player2);

    }

    public static void rps(String First, String Second){
        //Rock beats scissors, paper beats rock, scissors beat paper.
        /*
            First       Second          Result
            Rock        Rock            "Tie"
            Rock        Paper           "Player 2 wins"
            Rock        Scissors        "Player 1 wins"
            Paper       Rock            "Player 1 wins"
            Paper       Paper           "TIE"
            Paper       Scissors        "Player 2 wins"
            Scissors    Rock            "Player 2 wins"
            Scissors    Paper           "Player 1 wins"
            Scissors    Scissors        "TIE"
         */

        if (First.equals("Rock")){
            if (Second.equals("Rock")){
                System.out.println("TIE");
            }
            else if (Second.equals("Paper")){
                System.out.println("Player 2 wins");
            }
            else {  // this means if second = Scissors
                System.out.println("Player 1 wins");
            }
        }
        else if (First.equals("Paper")){

            if (Second.equals("Rock")){
                System.out.println("Player 1 wins");
            }
            else if (Second.equals("Paper")){
                System.out.println("TIE");
            }
            else {  // this means if second = Scissors
                System.out.println("Player 2 wins");
            }
        }
        else { // this means if first = Scissors
            if (Second.equals("Rock")){
                System.out.println("Player 2 wins");
            }
            else if (Second.equals("Paper")){
                System.out.println("Player 1 wins");
            }
            else {  // this means if second = Scissors
                System.out.println("TIE");
            }
        }
    }
}
