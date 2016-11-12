package Module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vlad on 10.11.2016.
 */
public class Task1 {

    public static void main(String[] args) {
        String fileName = "D:/file.txt";
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key1", "value1");
        String result;
        result = replacer(fileName, map);
        if (!result.equals("")) System.out.println("\nResult string after replacement:\n" + result);
    }

    private static String replacer(String fileName, Map<String, String> map) {
        String resultString;

        resultString = readFile(fileName);
        if (resultString != null) {
            System.out.println("Read from file:\n" + resultString);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                resultString = resultString.replaceAll(entry.getKey(), entry.getValue());
            } catch (NullPointerException e){
                System.err.println("NullPointerException exception in foreach map!");
            }
        }

        return resultString;
    }
    static String readFile(String fileName){
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return null;
        }

        try {
            stringBuilder = new StringBuilder();
            String lineFromFile = bufferedReader.readLine();
            while (lineFromFile != null) {
                stringBuilder.append(lineFromFile);
                stringBuilder.append(System.lineSeparator());
                lineFromFile = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.format("IOException in readFile() method: %s%n", e);
            return null;
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.err.format("IOException while closing resources: %s%n", e);
            }
        }

        return stringBuilder.toString();
    }

}
