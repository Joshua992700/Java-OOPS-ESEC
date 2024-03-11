import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> PQ = new PriorityQueue<>();
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String element = scanner.next();
            PQ.offer(element);
        }
        System.out.println("Initial Queue " + PQ);
        String strToRemove = scanner.next();
        PQ.remove(strToRemove);
        System.out.println("After Remove " + PQ);

        scanner.close();
    }
}