package Homeworks;

import java.util.Arrays;

public class Homework_32_MissingLetter {
    public static void main(String[] args) {
        char [] Letters = {'s','t','u','w'};

        System.out.println(Arrays.toString(Letters));
        System.out.println(FindLetter(Letters));
    }

    public static char FindLetter (char[] array) {
        int s = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) return (char) (array[i] - 1);
        }

        char MissedLetter= (char)s;
        return MissedLetter;
    }


    }



//  Create a method that takes an array of increasing letters and return //the missing letter.

//Examples
// MissingLetter(['a', 'b', 'c', 'e', 'f', 'g']) ➞ 'd'

// MissingLetter(['O', 'Q', 'R', 'S']) ➞ 'P'

// MissingLetter(['t', 'u', 'v', 'w', 'x', 'z']) ➞ 'y'

//MissingLetter(['m', 'o']) ➞ 'n'
//  ** Tests will be in one particular case (upper or lower b