package Day7_ForLoop;

public class Topic1_GB_StringMethodsExamples {
    public static void main(String[] args) {
       /* String MyName = "Gunel";
        System.out.printf("The length of %s is %d",MyName,MyName.length() );
        String Word = "Canada is beautiful";
        String NewWord = Word.replace("Canada","USA");
        */
        String FullName ="Alexander Graham Bell";
        String MiddleName =  FullName.substring(10,16);
        System.out.println("MiddleName = " + MiddleName);
        String MiddleAndLast = FullName.substring(10);
        System.out.println("MiddleAndLast = " + MiddleAndLast);


String MyName = "Rebecca";
        System.out.println("The length of " + MyName+" is "+MyName.length());
        System.out.printf("The length of %s is %d \n", MyName, MyName.length() );
        // %s <- String
        // %d <- Decimal (Number)

//        "The length of %s is %d", MyName,MyName.length()
        System.out.printf("The length of %s is %d",MyName,MyName.length());

        System.out.printf("I am %s",MyName);

        


    }
}
