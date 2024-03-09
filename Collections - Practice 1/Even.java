import java.util.ArrayList;
import java.util.Scanner;

public class Collections_ArrayList {
    private ArrayList<Integer> A1;
    private ArrayList<Integer> A2;

    public Collections_ArrayList() {
        A1 = new ArrayList<>();
        A2 = new ArrayList<>();
    }

    public ArrayList<Integer> saveEvenNumbers(int N) {
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }

    public void printEvenNumbers() {
        System.out.println("List of Even Numbers:");
        System.out.println(A1);
        System.out.println("List of Even Numbers multiplied by 2:");
        for (int num : A1) {
            A2.add(num * 2);
        }
        System.out.println(A2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Collections_ArrayList obj = new Collections_ArrayList();
        obj.saveEvenNumbers(N);
        obj.printEvenNumbers();
    }
}
