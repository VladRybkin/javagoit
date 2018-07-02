package book;

public class Base {
    Base() {
        int i = 1;
        System.out.println(i);
    }
}

class Quest4 extends Base {
    static int i;

    public static void main(String[] args) {
        Quest4 ob = new Quest4();
        System.out.print(i);
    }
}