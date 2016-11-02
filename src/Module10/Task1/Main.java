package Module10.Task1;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            throw new Exception("exeption");
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
