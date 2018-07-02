package book;

import java.util.Locale;

public class Loctest {
    public static void main(String[] args) {
        Locale current=new Locale("ua", "Ukraine");
        System.out.println(current.getCountry()) ;//код региона
        System.out.println( current.getDisplayCountry());//название региона
        current.getLanguage();//код языка региона
        current.getDisplayLanguage();//название языка региона
    }

}
