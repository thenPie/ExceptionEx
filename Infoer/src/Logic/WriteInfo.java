package Logic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteInfo {
    
    public static void Write(String[] info) {

        String fileName = info[0] + ".txt";
        String fileOutputPath = "../Files/" + fileName;
        
        File file = new File(fileOutputPath);

        /*
        try {

            FileWriter writer = new FileWriter(fileOutputPath);

            writer.write("<" + info[0] + "><" + info[1] + "<>" + info[2] + "<>" + info[3] + "<>" + info[4] + "<>" + info[5] + "<");

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        boolean fileExists = Files.exists(Paths.get(fileOutputPath));
        System.out.println("File name is " + fileName + "\n" + fileOutputPath + " - " + fileExists);
        */
    }

}
