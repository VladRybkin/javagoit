package Module10.task2;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main2 {
    public static void main(String[] args) throws MyException{
    try{
       throw new MyException("Exception");
    } catch (MyException e){
        System.err.println(e.getMessage());
    }finally {
        System.out.println("finally");
    }
    }



}
