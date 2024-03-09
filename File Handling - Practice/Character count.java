import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "input.txt";
        char searchChar = sc.next().charAt(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCount = 0;
            int totalCharacters = 0;
            int c;
            while ((c = reader.read()) != -1) {
                char ch = Character.toLowerCase((char) c);
                if (ch == Character.toLowerCase(searchChar)) {
                    charCount++;
                }
                totalCharacters++;
            }

            if (charCount > 0) {
                System.out.println("Character: " + searchChar + " found! Count : " + charCount);
            } 
            if (charCount == 0) {
                System.out.println("Character not found!");
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}