package Module10.Task5;

/**
 * Created by Vlad on 02.11.2016.
 */
public class FirstException extends Throwable {
    private String message;

    public FirstException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "FirstException{" +
                "message='" + message + '\'' +
                '}';
    }
}
