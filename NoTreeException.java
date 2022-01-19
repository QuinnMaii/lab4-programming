package exceptions;

public class NoTreeException extends NullPointerException {
    public NoTreeException() {
        super();
    }

    public NoTreeException(String message) {
        super(message);
    }
}
