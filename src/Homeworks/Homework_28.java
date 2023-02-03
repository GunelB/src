package Homeworks;

public class Homework_28 {
    public static void main(String[] args) {
      String str="hello my name is Gunel.i am 35 years old.i live in Toronto.I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";

        String[]array =str.split("[.]");

      // String lowerCase =lowerCaseAndTrim;
        //System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,str.length()));


        }

    //    public static String
      /*

        1- Each sentence should start with upper case letter.
        2- The rest of the letters are lower case.
        3- Get rid of the empty spaces in front and end of the sentences.

        after you make the modification print each sentence and it's length
       At the end combine all the sentences to get proper paragraph    */
    }



    //    String LowerCase =  LowerCaseandTrim(Sentence);
   //     String FirstIndexUpperCase = StartsUpperCase(LowerCase);
   //     System.out.println(FirstIndexUpperCase);
   //     Lenght(FirstIndexUpperCase);


  /*  public static void Lenght (String  Sentence){
        String [] NewSentence = Sentence.split("\\.");

        int Length = 0;
        for (String ForEach : NewSentence){

            Length = ForEach.trim().length()+1;
            System.out.println("Length of \""+ForEach+".\" is => " + Length+" digits.");
        }
    }
    public static String LowerCaseandTrim(String Sentence){
        String [] NewSentence = Sentence.split("\\.");
        String TrimAndLowerCase="";
        for (String ForEach : NewSentence){
            TrimAndLowerCase= TrimAndLowerCase+( ForEach.trim().toLowerCase()+".");
        }
        return TrimAndLowerCase;
    }
    public static String StartsUpperCase (String Sentence){
        String [] SentenceArray = Sentence.split("\\.");
        String NewSentence = "";
        String SecondSentence = "";
        for (String ForEach : SentenceArray) {
            NewSentence = ForEach.substring(0, 1).toUpperCase();
            SecondSentence =SecondSentence + NewSentence + ForEach.substring(1)+". ";
        }
        return SecondSentence;
    }

   */