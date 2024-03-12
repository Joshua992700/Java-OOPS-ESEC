import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.equals("SUPERhello")) {
            System.out.println("SUPER12");
        } 
        else if (n.length() >= 8 && n.substring(0, 5).equals("SUPER")) {
            System.out.println("Welcome Employee");
        } 
        else {
            System.out.println("Sorry, You are Not an employee");
        }
    }
}