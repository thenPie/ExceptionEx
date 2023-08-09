package Logic;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteInfo {
    
    public static void Write(String[] info) throws IOException {

        String fileName = info[0] + ".txt";
        String fileOutputPath = "src/Files/" + fileName;

        boolean fileExists = Files.exists(Paths.get(fileOutputPath));
        DoesFileExist(fileExists, fileOutputPath);
        Writeer(info, fileOutputPath);

    }
    
    private static void DoesFileExist(boolean fileExists, String fileOutputPath) throws IOException {

        if (fileExists == false) {
            Files.createFile(Paths.get(fileOutputPath));
        }

    }
    
    private static void Writeer(String[] info, String fileOutputPath) throws IOException {

        try (FileWriter writer = new FileWriter(fileOutputPath, true)) {
            writer.write("<" + info[0] + "><" + info[1] + "><" + info[2] + "><" + info[3] + "><" + info[4] + "><" + info[5] + ">\n");
        }
        
    }

}
