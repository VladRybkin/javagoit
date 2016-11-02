package Module10.task2;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main2 {
    public static void main(String[] args) {
    try{
        amount(-1);
    } catch (Exception e){
        System.out.println(e);
        throw e;
    }
    }
        static void amount(int a) {
        if (a < 0) throw new MyException("a<0");
        System.out.println("Result is : " + a);
    }
}
