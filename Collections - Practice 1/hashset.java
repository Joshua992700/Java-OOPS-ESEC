import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringSetDemo {

    public static void main(String[] args) {
        Set<String> S1 = new HashSet<>();
        Set<String> S2 = new LinkedHashSet<>();
        Set<String> S3 = new TreeSet<>();
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        for (String str : inputs) {
            S1.add(str);
            S2.add(str);
            S3.add(str);
        }
        scanner.close();
        
        printAll(S1, "Using HashSet");
        printAll(S2, "Using LinkedHashSet");
        printAll(S3, "Using TreeSet");
    }

    private static void printAll(Set<String> set, String message) {
        System.out.print(message + ": ");
        System.out.println(set);
    }
}
