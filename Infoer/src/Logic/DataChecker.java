package Logic;

import Exceptions.DaysException;
import Exceptions.MonthsException;
import Exceptions.NotACharException;
import Exceptions.NotADateException;
import Exceptions.NotAGenderException;
import Exceptions.NotAPhoneNumberException;
import Exceptions.YearException;

public class DataChecker {
    
    public static void isBirthday(String[] info) throws NotADateException, DaysException, MonthsException, YearException {

        int birthdayLocation = 3;
        String[] birthday = info[birthdayLocation].split("\\.");

        int days = 31;
        int dayLocation = 0;
        int months = 12;
        int monthLocation = 1;
        int yearMin = 1000;
        int yearMax = 9999;
        int yearLocation = 2;

        int[] date = new int[birthday.length];
        for (int i = 0; i < birthday.length; i++) {
            date[i] = Integer.parseInt(birthday[i]);
        }

        if (birthday.length != 3) {
            System.out.println(birthday.length);
            throw new NotADateException("Not a date");
        }
        if (date[dayLocation] > days) {
            throw new DaysException("Too many days for a month");
        }
        if (date[monthLocation] > months) {
            throw new MonthsException("Too many months for a year");
        }
        if (date[yearLocation] < yearMin) {
            throw new YearException("What year? minned");
        }
        if (date[yearLocation] > yearMax) {
            throw new YearException("What year? maxed");
        }

    }

    public static void isPhoneNumber(String[] info) throws NotAPhoneNumberException {

        int phoneNumberLocation = 4;
        int phoneNumberLengthRussia = 11;

        try {
            long number = Long.parseLong(info[phoneNumberLocation]);
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
