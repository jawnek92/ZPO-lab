package zad4;

public class NoneFreeAccessException extends Exception {
    public NoneFreeAccessException() {super();}

    public NoneFreeAccessException(String message) {
        super(message);
    }

    public NoneFreeAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoneFreeAccessException(Throwable cause) {
        super(cause);
    }

    public NoneFreeAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
