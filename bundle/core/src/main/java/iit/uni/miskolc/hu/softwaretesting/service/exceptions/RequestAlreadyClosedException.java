package iit.uni.miskolc.hu.softwaretesting.service.exceptions;

public class RequestAlreadyClosedException extends Exception {

    public RequestAlreadyClosedException(String message) {
        super(message);
    }

}
