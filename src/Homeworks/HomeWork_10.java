package Homeworks;

import java.util.Scanner;

public class HomeWork_10 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter a number");
  int Number = scan.nextInt();
  int SumEvenNum = 0;
  int SumOddNum = 0;
  for (int k = 0; k <= Number; k++) {
   if(k % 2 ==0){
    SumEvenNum = SumEvenNum+ k;
   }

   for (int j = 0; j <= Number; j++) {
       if(j%2!=0){
 SumOddNum = SumOddNum + j;
           break;
          }
      }

   }
  System.out.print("Sum of even number is= "     + SumEvenNum);
    System.out.println("Sum of odd number is= "  + SumOddNum);







 }
}
















       /* System.out.println("Please enter a name");
        String name = scan.next();
        String NewName = " ";
        if (name.startsWith("A") && name.endsWith("l")) {
            NewName = name.replace("A","B");
        } else if (name.startsWith("B") && (name.endsWith("d"))) {
            NewName=name.replace("F","B");
            System.out.println(NewName);
        }
        System.out.println(NewName);   */
       /* System.out.println("Please enter a sentence");
        Scanner Scan= new Scanner(System.in);
        String Sentence = scan.nextLine();
        char chToReplacedWith='G';
        int index='0';
        int index1 ='4';

        if(Sentence.startsWith("B")|| (Sentence.startsWith("b"))){
            System.out.println(Sentence.replace(Sentence.charAt(4),('G')));
        }else if (Sentence.endsWith("E")||(Sentence.endsWith("e"))) {
            System.out.println(Sentence.replace(Sentence.charAt(4),('G')));
        }else if(Sentence.contains("A")||(Sentence.contains("a"))) {
            System.out.println(Sentence.replace(Sentence.charAt(2),('G')));
        }

        */