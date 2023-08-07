package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatReturn {
    
    private static final Scanner sc = new Scanner(System.in);

    public static float FloatIs() {

        // InputMismatchException

        float ft = 0;
        do {
            try {
                System.out.println("Enter a float number: ");
                ft = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter again.");
            }
            sc.nextLine();
        } while (ft == 0);

        return ft;

    }

}
