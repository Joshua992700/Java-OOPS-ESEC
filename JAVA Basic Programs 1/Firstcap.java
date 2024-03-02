import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.nextLine();
        System.out.println(n.substring(0, 1).toUpperCase() + n.substring(1));
        
        scanner.close();
    }
}