import java.util.Scanner;

import Logic.ExceptionChecker;
import Logic.WriteInfo;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.println("Input your info");
        String input = sc.nextLine();
        String[] info = input.split(" ");

        int amountOfVariables = 6;

        ExceptionChecker.MoreOrLessInfo(info, amountOfVariables);
        
        WriteInfo.Write(info);
        
    }
}
