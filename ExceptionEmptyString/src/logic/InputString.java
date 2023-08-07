package logic;

import java.util.Scanner;

public class InputString {

    private static final Scanner sc = new Scanner(System.in);
    
    public static String InpStr() throws EmptyStringException {

        System.out.println("Input a string:");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            throw new EmptyStringException();
        }

        return str;

    }

}
