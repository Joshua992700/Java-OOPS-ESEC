import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        File file = new File("File.txt");

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File creation failed!!!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
