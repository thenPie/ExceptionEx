package Logic;

import Exceptions.LessInfoException;
import Exceptions.MoreInfoException;

public class ExceptionChecker {
    
    public static void MoreOrLessInfo(String[] info, int amountOfVariables) throws MoreInfoException, LessInfoException {

        if (info.length > amountOfVariables) {
            throw new MoreInfoException("Amount of elements in the array is " + info.length);
        }
        if (info.length < amountOfVariables) {
            throw new LessInfoException("Amount of elements in the array is " + info.length);
        }

    }

}
