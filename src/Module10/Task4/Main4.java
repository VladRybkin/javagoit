package Module10.Task4;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main4 {
    public static void main(String[] args) {
        try {
            f();
        }catch (NullPointerException e){
            throw new ClassCastException();
        }

    }
    static void f(){
        g();
    }
    static void g(){
        throw new NullPointerException();
    }
}
