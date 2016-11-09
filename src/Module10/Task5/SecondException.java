package Module10.Task5;

/**
 * Created by Vlad on 02.11.2016.
 */
public class SecondException extends Exception {
    private String message;

    public SecondException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SecondException{" +
                "message='" + message + '\'' +
                '}';
    }
}
