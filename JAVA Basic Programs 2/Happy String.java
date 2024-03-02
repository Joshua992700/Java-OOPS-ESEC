import java.util.*;

public class HappyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        if (isHappyString(str)) {
            System.out.println("HAPPY");
        } else {
            System.out.println("NOT HAPPY");
        }
    }

    public static boolean isHappyString(String str) {
        Map<Character, Integer> vowelCounts = new HashMap<>();
        for (char ch : "AEIOUaeiou".toCharArray()) {
            vowelCounts.put(ch, 0);
        }

        for (char ch : str.toCharArray()) {
            if (vowelCounts.containsKey(ch)) {
                vowelCounts.put(ch, vowelCounts.get(ch) + 1);
            }
        }

        for (int count : vowelCounts.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
