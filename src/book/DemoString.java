package book;

public class DemoString {
    static int i;

    public static void main(String[] args) {
        char s[] = {'J', 'a', 'v', 'a'}; // массив // комментарий содержит результат выполнения кода
        String str = new String(s); str="Java";
        if (!str.isEmpty()) {
            i = str.length(); // i=4
            str = str.toUpperCase(); // str="JAVA"
             String num = String.valueOf(6); // num="6"
            num = str.concat("-" + num); // num="JAVA-6"
            char ch = str.charAt(2); // ch='V'
            i = str.lastIndexOf('A'); // i=3 (-1 если нет)
            num = num.replace("6", "SE"); // num="JAVA-SE"
            str.substring(0, 4).toLowerCase(); // java
            str = num + "-6";// str=”JAVA-SE-6”
            String[] arr = str.split("-");
            for (String ss : arr)
                System.out.println(ss);
        } else {
            System.out.println("String is empty!");
        }
    }
}

