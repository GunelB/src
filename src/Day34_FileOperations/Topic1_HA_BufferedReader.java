package Day34_FileOperations;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic1_HA_BufferedReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //DataType VariableName = new DataType();  <- when you didn't know what is constructor
        //DataType VariableName = new Constructor(); <-
        FileReader FR = new FileReader("test_HA.txt");

        BufferedReader MyReader = new BufferedReader(FR);


        String line = MyReader.readLine();
        System.out.println("line = " + line);
        System.out.println("****************");
        int i = 1;
        while ( line != null ){
            System.out.println(i+"-"+line);   //  1- line 1
            line = MyReader.readLine();
            i++;
        }


    }
}
