import java.util.Scanner;

class NumberPrinter extends Thread {
    private int start;

    public NumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i < start + 10; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        if (T <= 0) {
            System.out.println("No Threads created");
        } 
        else {
            Thread[] threads = new Thread[T];
            for (int i = 0; i < T; i++) {
                int start = sc.nextInt();
                threads[i] = new NumberPrinter(start);
            }
            for (int i = 0; i < T; i++) {
                System.out.println("Thread " + (i+1) + " Printing:");
                threads[i].start();
                try {
                    threads[i].join();
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
