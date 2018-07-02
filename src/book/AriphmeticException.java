package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AriphmeticException {
    public static int meth(int x) {
        int y = 010;
        try {
            y += x;
            if (x <= 5) throw new Exception();
            y++;
        } catch (Exception e) {
            y--;
        }
        return y;
    }

    public static void main(String[] args) {
       try {
           BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
           ;
           String b=bufferedReader.readLine();
           int a=Integer.parseInt(b);
           System.out.println(a);
       } catch (IOException e){
           System.out.println("exception");
       }catch (NumberFormatException e){
           System.out.println("Exception");
       }

    }
}

