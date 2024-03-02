import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] n = input.split(" ");
        for (String i: n) {
            System.out.print(i+"\n");
        }
    }
}