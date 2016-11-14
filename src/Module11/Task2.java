package Module11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Module11.Task1.readFile;
import static Module11.Task1.replacer;

/**
 * Created by Vlad on 12.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        String fileName = "D:/file.txt";
        Map<String, String> map = new HashMap<>();
        map.put("lesson", "topic");
        map.put("Lesson", "Topic");
        File file;
        String result;

        file = fileContentReplacer(fileName, map);
        if (file != null) System.out.println("\nResult file after replacement:\n" + readFile(file.getPath()));
    }

    static File fileContentReplacer(String fileName, Map<String, String> map) {
        File file = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String replaced = replacer(fileName, map);

        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(replaced);
            file = new File(fileName);
        } catch (IOException e) {
            System.err.format("IOException in fileContentReplacer() method: %s%n", e);
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                System.err.format("IOException while closing resources: %s%n", e);
            }
        }

        return file;
    }

}
