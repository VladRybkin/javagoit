package Module10.Task5;

/**
 * Created by Vlad on 02.11.2016.
 */
public class Main {
    public static void test(int amount) throws FirstException, SecondException, ThirdException {
        switch (amount) {
            case 1:
                throw new FirstException("1");
            case 2:
                throw new SecondException("2");
            case 3:
                throw new ThirdException("3");
        }

    }

    public static void main(String[] args) {
        try {
            test(3);
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println(e);
        }

    }

}

