package Day34_FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Topic3_HA_Example {
    public static void main(String[] args) {

        ArrayList<Movie> Top250 = new ArrayList<>();
        try {
            FileReader FR = new FileReader("top250.txt");
            BufferedReader MyReader = new BufferedReader(FR);

            String line = MyReader.readLine();

            while (line != null){
                // do something
                //line = 9.2  The Shawshank Redemption (1994)
                StringBuilder SB = new StringBuilder(line);

                String R = SB.substring(0,3);  // 9.2
                //System.out.println(R);

                //line = 9.2  The Shawshank Redemption (1994)
                SB.delete(0,5);

                //line = The Shawshank Redemption (1994)
                int Position1 = SB.indexOf("(");
                String Name = SB.substring(0, Position1).trim();


                //System.out.println(Name);
                //line = The Shawshank Redemption (1994)
                SB.delete(0, Position1+1);

                //line = 1994)
                String Y = SB.substring(0,4);
                //System.out.println(Y);

                Movie AMovie = new Movie();
                AMovie.MovieName = Name;
                AMovie.Year = Integer.parseInt(Y);
                AMovie.Rating = Double.parseDouble(R);
                Top250.add(AMovie);

                line = MyReader.readLine();
            }



        }catch (FileNotFoundException e){
            System.out.println("top250.txt not found!");
        }catch (IOException e){
            System.out.println("Something happened while reading the file!");
        }

        Print2000andOver(Top250);

        System.out.println("************************");

        Print8andover(Top250);
    }

    //Please create a method
    //Print2000andOver
    //Parameters 1- Arraylist of Movie
    //ReturnType void

    //PublicPrivateProtectedDefault StaticOrNot ReturnType MethodName (Param1Type Param1Name,.....)
    public static void Print2000andOver(ArrayList<Movie> p_Movies){
        //print the movies that created in 2000 and over
        for (Movie MyMovie : p_Movies){
            if (MyMovie.Year >= 2000){
                System.out.println(MyMovie.MovieName);
            }
        }
    }

    //Print the movie name and it's rating if it is >=8.0
    // Print8andover
    //Parameters 1 - Arraylist<Movie>
    //ReturnType void

    public static void Print8andover(ArrayList<Movie> p_Movies){
        for(Movie MyMovie : p_Movies){
            if (MyMovie.Rating >= 8.5){
                System.out.println(MyMovie.MovieName+" "+MyMovie.Rating);
            }
        }
    }


}

class Movie{
    String MovieName;
    int Year;
    double Rating;
}
