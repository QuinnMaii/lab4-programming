package exceptions;

public class NoRiverException extends NullPointerException {
    public NoRiverException() {
        super();
    }

    public NoRiverException(String message) {
        super(message);
    }
}
