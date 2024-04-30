import java.util.Scanner;

class NumberPrinter extends Thread {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        if (T <= 0) {
            System.out.println("No Threads created");
        } else {
            int ran = scanner.nextInt();
            int[] a = new int[T];
            for (int i = 0; i < T; i++) {
                a[i] = scanner.nextInt();
            }

            Thread[] threads = new Thread[T];
            for (int i = 0; i < T; i++) {
                threads[i] = new NumberPrinter(a[i], a[i] + ran - 1);
            }

            for (int i = 0; i < T; i++) {
                System.out.println("Thread " + (i + 1) + " Printing:");
                threads[i].start();
                try {
                    threads[i].join(); // Wait for each thread to finish before printing next thread's output
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
