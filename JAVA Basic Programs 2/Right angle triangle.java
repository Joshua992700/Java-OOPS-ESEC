import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows;
    rows = sc.nextInt();
    int k = 2 * rows - 2;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < k; j++) {
        System.out.print(" ");
      }
      k = k - 2;
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}