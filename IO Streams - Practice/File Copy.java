import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
    public static void copyFileUsingStreams(String sourcePath, String destinationPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Accept the file paths from the user
        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        copyFileUsingStreams(sourcePath, destinationPath);
        System.out.println("File copied successfully.");
    }
}
