package Day34_FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Topic2_HA_FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter FW = new FileWriter("NewFile_HA5.txt");
            FW.write("Hello, this is my first line.");
            FW.write(13); // 13 means Return key (ENTER KEY)
//            FW.write("\n");  <- this line will also add a new line
            FW.write("Hi Again!");

            FW.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
