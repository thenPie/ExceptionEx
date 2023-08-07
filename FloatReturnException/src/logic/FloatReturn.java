package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatReturn {
    
    private static final Scanner sc = new Scanner(System.in);

    public static float FloatIs() {

        // InputMismatchException

        Float ft = null;

        do {
            try {
                
                System.out.println("Enter a float number: ");
                ft = sc.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter again.");
            }
            sc.nextLine();
        } while (ft == null);
        return ft;

    }

}
