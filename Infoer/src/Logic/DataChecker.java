package Logic;

import Exceptions.NotACharException;
import Exceptions.NotAGenderException;
import Exceptions.NotAPhoneNumberException;

public class DataChecker {
    
    public static void isBirthday(String[] info) {

        int birthdayLocation = 3;

    }

    public static void isPhoneNumber(String[] info) throws NotAPhoneNumberException {

        int phoneNumberLocation = 4;
        int phoneNumberLengthRussia = 7;

        try {
            int number = Integer.parseInt(info[phoneNumberLocation]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a phone number");
        }

        if (info[phoneNumberLocation].length() != phoneNumberLengthRussia) {
            throw new NotAPhoneNumberException("Probably not a russian phone number");
        }

    }
    
    public static void isGender(String[] info) throws NotACharException, NotAGenderException {

        int genderLocation = 5;
        
        if (info[genderLocation].length() != 1) {
            throw new NotACharException("Not a char");
        }
        
        if (isInteger(info[genderLocation]) == true) {
            throw new NotAGenderException("Not a gender");
        }

    }

    private static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}
