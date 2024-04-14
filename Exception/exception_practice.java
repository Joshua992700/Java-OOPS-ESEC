import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int position = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(Math.abs(arr[i] - 7) + " ");
        }
        System.out.println();
        
        if (position < 0 || position >= n) {
            System.out.println("Invalid Position");
        } else {
            if (arr[position] - 7 == 0) {
                System.out.println("Difference is Zero - Cannot Divide");
            } else {
                int div = Math.abs(arr[position] - 7);
                System.out.println(arr[position] / div);
            }
        }
        
        scanner.close();
    }
}
