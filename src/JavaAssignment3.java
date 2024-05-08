import java.io.*;
import java.util.*;

public class JavaAssignment3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CharacterCounter <filename>");
            return;
        }

        String fileName = args[0];
        Map<Character, Integer> charCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        String outputFile = "character_counts.txt";
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Character counts saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
