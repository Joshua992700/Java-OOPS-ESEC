import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> studentMarks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int marks = scanner.nextInt();
            studentMarks.put(name, marks);
        }
        Map<String, Integer> sortedMap = new TreeMap<>(studentMarks);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }        
        scanner.close();
    }
}
