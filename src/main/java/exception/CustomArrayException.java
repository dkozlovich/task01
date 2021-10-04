package exception;

public class CustomArrayException extends Exception{
    public CustomArrayException(Throwable cause) {
        super(cause);
    }

    public CustomArrayException(String message) {
        super(message);
    }
}
