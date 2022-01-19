package exceptions;

public class UnknownLocationException extends Exception {
    public UnknownLocationException() {
        super();
    }

    public UnknownLocationException(String message) {
        super(message);
    }
}
