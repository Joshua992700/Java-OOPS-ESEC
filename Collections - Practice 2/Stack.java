import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> S1 = new Stack<>();
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            S1.push(value);
        }
        int removedValue = S1.pop();
        Stack<Integer> tempStack = new Stack<>();
        while (!S1.isEmpty()) {
            tempStack.push(S1.pop());
        }
        
        System.out.print("After removing Top Most value ");
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
        System.out.println();
        System.out.println("The size of stack is " + (size-1));
        sc.close();
    }
}