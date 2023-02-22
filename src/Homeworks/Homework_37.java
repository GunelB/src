package Homeworks;

public  class Homework_37 {
    public static void main(String[] args) {
        System.out.println(ConcatandPrint("Gunel", "Baghirova"));
        System.out.println("****");
        ConcatandPrint("Gunel","Baghirova",3);
    }

    public static String ConcatandPrint(String p_name,String p_surname) {
        return p_name.concat(p_surname);
    }

    public static void ConcatandPrint(String p_name1, String p_name2,int int_1) {
        for(int i=0;i<int_1;i++){
            System.out.println(p_name1.concat(p_name2));
        }

    }
}



  /*  Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string, but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.
     example -
    ConcatandPrint("FirstName","LastName") it will return ==> "FirstName LastName" ConcatandPrint("FirstName","LastName", 3) it will print ==> "FirstName Lastname" 3 times.
     Please create a method with return type String and with 2 String parameters.
     Method name is ConcatandPrint;
     This method will concatenate 2 parameters and return it.
     Please create an overload method of ConcatandPrint with return type void and with 2 String and 1 Integer parameter.
        This method will concatenate 2 parameters and print them param3 times. */