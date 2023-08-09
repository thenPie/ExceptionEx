import java.util.Scanner;

import Logic.ExceptionChecker;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.println("Input your info");
        String input = sc.nextLine();
        String[] info = input.split(" ");

        int amountOfVariables = 6;

        ExceptionChecker.MoreOrLessInfo(info, amountOfVariables);

        for (int i = 0; i < amountOfVariables; i++) {
            System.out.println(i + " - " + info[i]);
        }

    }
}
