import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "PROGRAM";
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
    }
}
