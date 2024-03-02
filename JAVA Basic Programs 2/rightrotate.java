import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int rotations = scanner.nextInt();
        if (size == 1) {
            System.out.println("Invalid Input");
        }
        else{
            rightRotate(array, rotations);
            printArray(array);
            scanner.close();
        }
    }

    public static void rightRotate(int[] array, int k) {
        int n = array.length;
        k %= n;

        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}