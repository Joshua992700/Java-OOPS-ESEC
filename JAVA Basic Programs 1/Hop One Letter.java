import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] s = n.split("");
        StringBuilder a = new StringBuilder();
        
        for (int i = 0; i < n.length(); i += 2) {
            a.append(s[i]);
        }
        
        String res = a.toString();
        System.out.println(res);
    }
}