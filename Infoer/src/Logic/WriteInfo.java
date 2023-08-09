package Logic;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Exceptions.DaysException;
import Exceptions.MonthsException;
import Exceptions.NotACharException;
import Exceptions.NotADateException;
import Exceptions.NotAGenderException;
import Exceptions.NotAPhoneNumberException;
import Exceptions.YearException;

public class WriteInfo {
    
    public static void Write(String[] info) throws NotAPhoneNumberException, NotACharException, NotAGenderException, NotADateException, DaysException, MonthsException, YearException {

        String fileName = info[0] + ".txt";
        String fileOutputPath = "src/Files/" + fileName;

        boolean fileExists = Files.exists(Paths.get(fileOutputPath));
        DoesLastNameExist(fileExists, fileOutputPath);
        DataChecker.isBirthday(info);
        DataChecker.isPhoneNumber(info);
        DataChecker.isGender(info);
        Writeer(info, fileOutputPath);

    }
    
    private static void DoesLastNameExist(boolean fileExists, String fileOutputPath) {

        try {
            if (fileExists == false) {
                Files.createFile(Paths.get(fileOutputPath));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void Writeer(String[] info, String fileOutputPath) {

        try {
            FileWriter writer = new FileWriter(fileOutputPath, true);
            writer.write("<" + info[0] + "><" + info[1] + "><" + info[2] + "><" + info[3] + "><" + info[4] + "><" + info[5] + ">\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
