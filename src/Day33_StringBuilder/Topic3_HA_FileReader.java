package Day33_StringBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic3_HA_FileReader {
    public static void main(String[] args) {
        /*
        Paths:
                //Mac OS X: /Users/username/Desktop/foldername..../File
                //Windows: C:/Users/username/Desktop/foldername..../File
                //Linux: /home/username/Desktop/foldername..../File
         */

        try {
            FileReader MyReader = new FileReader("test.txt");

            /*
            int ch = MyReader.read();

            while (ch != -1){
                System.out.print((char)ch);
                ch = MyReader.read();
            }
             */

            // Below code is exactly same with above code.
            int ch;
            while ((ch = MyReader.read()) != -1 ){
                System.out.print((char)ch);
            }


        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e2){
            System.out.println("Something happened while reading!");
        }
    }
}
