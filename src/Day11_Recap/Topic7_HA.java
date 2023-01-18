package Day11_Recap;

import java.util.Scanner;

public class Topic7_HA {
    public static void main(String[] args) {
/*
Write   a   program   that   will   count   how   many   times   "j"   is   found   in   any   given   String:
String mystring="java is fun, but sometimes java is just pain.Love java java java";

 */
        String Mystring="java is fun, but sometimes java is just pain.Love java java java";
        int count = 0;
        for (int i = 0; i <Mystring.length()-1 ; i++) {
            if (Mystring.charAt(i) == 'j'){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
