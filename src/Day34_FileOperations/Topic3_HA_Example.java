package Day34_FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Topic3_HA_Example {
    public static void main(String[] args) {
        try {
            FileReader FR = new FileReader("top250.txt");
            BufferedReader MyReader = new BufferedReader(FR);

            ArrayList<Movie> Top250 = new ArrayList<>();

            String line = MyReader.readLine();

            while (line != null){
                // do something
                //line = 9.2  The Shawshank Redemption (1994)
                StringBuilder SB = new StringBuilder(line);

                String R = SB.substring(0,3);  // 9.2
                System.out.println(R);

                //line = 9.2  The Shawshank Redemption (1994)
                SB.delete(0,5);

                //line = The Shawshank Redemption (1994)
                int Position1 = SB.indexOf("(");
                String Name = SB.substring(0, Position1).trim();


                System.out.println(Name);
                //line = The Shawshank Redemption (1994)
                SB.delete(0, Position1+1);

                //line = 1994)
                String Y = SB.substring(0,4);
                System.out.println(Y);

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
    }
}

class Movie{
    String MovieName;
    int Year;
    double Rating;
}
