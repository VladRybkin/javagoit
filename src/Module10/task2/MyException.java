package Module10.task2;

/**
 * Created by Vlad on 02.11.2016.
 */
public class MyException extends RuntimeException {
    private String e;

    public MyException(String e) {
        this.e = e;
    }


    @Override
    public String toString() {
        return "MyException{" +
                "e='" + e + '\'' +
                '}';
    }
}
