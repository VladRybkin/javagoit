package Module11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Module11.Task1.readFile;

/**
 * Created by Vlad on 13.11.2016.
 */
public class Task4 {
    public static void main(String[] args) {

        String fileName = "D:/file.txt";
        String searchWord = "lesson";
        int wordCounter;

        wordCounter = checkWord1(fileName, searchWord);
        System.out.println("Word '" + searchWord + "' found " + wordCounter + " times in the file with method checkWord1().");

        wordCounter = checkWord2(fileName, searchWord);
        System.out.println("Word '" + searchWord + "' found " + wordCounter + " times in the file with method checkWord2().");
    }

    static int checkWord1(String fileName, String word) {

        int wordCounter = 0;
        String tempString;
        Scanner scanner = null;
        String replaced = readFile(fileName);
        System.out.println("Source file:\n" + replaced);

        try {
            scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                tempString = scanner.next();
                if (tempString.toUpperCase().contains(word.toUpperCase())) {
                    wordCounter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return 0;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return wordCounter;
    }

    static int checkWord2(String fileName, String word) {

        int wordCounter = 0;
        String tempString;
        String replaced = readFile(fileName);
        System.out.println("Source file:\n" + replaced);

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNext()) {
                tempString = scanner.next();
                if (tempString.toUpperCase().contains(word.toUpperCase())) {
                    wordCounter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return 0;
        }

        return wordCounter;
    }
}
