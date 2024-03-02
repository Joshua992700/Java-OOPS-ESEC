import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        List<Integer> n = new ArrayList<>();
        for (String number : numbers) {
            n.add(Integer.parseInt(number));
        }
        int count = 0;
        int max = 0;
        int index = -1;
        for (int i = 0; i < n.size(); i++) {
            count = 0;
            for (int j = 0; j < n.size(); j++) {
                if (n.get(i) == n.get(j)) {
                    count += 1;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        if (max > n.size() / 2) {
            System.out.println(n.get(index));
        } else {
            System.out.println("0");
        }
    }
}

