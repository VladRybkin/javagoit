package Module10.Task5;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main {
    public static void test(String name) throws FirstException, SecondException, ThirdException{
        switch (name){
            case "first":throw new FirstException("1");
            case "second": throw new SecondException("2");
            case "third": throw new ThirdException("3");
        }

    }

    public static void main(String[] args) {
        try {
            test("second");
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println(e);
        }

    }

}

