package Homeworks;

public class Homework_33 {
    public static void  main(String[] args) {

        MyWord new1;
        new1 = new MyWord();
        new1.InputWord="  Home";

        MyWord new2;
        new2 = new MyWord();
        new2.InputWord="Not  Home";

        System.out.println(new2.OmitNo());
        System.out.println(new1.OmitNo());
    }

    static class  MyWord {
        String InputWord;

        public String OmitNo() {
            String Not = "";
            if (InputWord.startsWith("Not")) {
                return InputWord;
            } else {
                return "Not  " + InputWord;
            }

        }
    }
    }

//public class Homework_33 {
//    public static void main(String[] args) {
//       Word new1 = new Word();
//        new1.YourWord = "Home";
//        System.out.println(new1.NotToBe());
//        Word new2 = new Word();
//        new2.YourWord = "Not Home";
//        System.out.println(new2.NotToBe());
//        Word new3 = new Word();
//        new3.YourWord = "Car";
//        System.out.println(new3.NotToBe());
//
//
//
//    }
//
//}
//class Word{
//    String YourWord;
//
//    public String NotToBe(){
//
//        if (YourWord.startsWith("Not")){
//            return YourWord;
//        }else {
//            return "Not "+ YourWord;
//        }
//
//    }
//}
