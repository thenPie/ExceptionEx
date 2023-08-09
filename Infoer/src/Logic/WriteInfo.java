package Logic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteInfo {
    
    public static void Write(String[] info) {

        String fileName = info[0] + ".txt";
        String fileOutputPath = "src/Files/" + fileName;

        // writer.write("<" + info[0] + "><" + info[1] + "<>" + info[2] + "<>" + info[3] + "<>" + info[4] + "<>" + info[5] + "<");

        boolean fileExists = Files.exists(Paths.get(fileOutputPath));
        
    }

}
