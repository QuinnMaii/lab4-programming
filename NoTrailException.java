package exceptions;

public class NoTrailException extends NullPointerException {
    public NoTrailException() {
        super();
    }

    public NoTrailException(String message) {
        super(message);
    }
}
