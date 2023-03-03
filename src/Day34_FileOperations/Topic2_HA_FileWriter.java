package Day34_FileOperations;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileWriter;
import java.io.IOException;

public class Topic2_HA_FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter FW = new FileWriter("NewFile_HA3.txt");
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
