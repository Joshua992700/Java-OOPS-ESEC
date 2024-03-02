import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        printDiamondPattern(rows, ch);
        scanner.close();
    }

    public static void printDiamondPattern(int rows, char ch) {
        int spaces = rows - 1;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print(ch);
            }

            System.out.println();

            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = rows * 2 - 3;

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print(ch);
            }

            System.out.println();

            spaces++;
            stars -= 2;
        }
    }
}