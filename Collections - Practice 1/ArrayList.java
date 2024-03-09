import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String word = scanner.next();
            stringList.add(word);
        }

        printAll(stringList);
        scanner.close();
    }

    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
