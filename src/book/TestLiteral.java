package book;

public class TestLiteral {
    public static void main(String[] args) {
        String str="ava"; char ch=0x71; // 74 - это код символа 'J'
        str=ch+str; System.out.print(str);
        String s = new String("Java"); String t = new String(); String r = null;
         r = s + t + r;
         r = s + ch;

//        long a=0xC0B0L;
//        int b=0xF+1;
//        int c=0b110;
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println('\r'+"fsds'\n" + "'dfs");
    }
}
