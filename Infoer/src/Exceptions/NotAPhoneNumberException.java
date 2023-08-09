package Exceptions;

public class NotAPhoneNumberException extends Exception {
    
    public NotAPhoneNumberException(){}

    public NotAPhoneNumberException(String msg) {
        super(msg);
    }

}
