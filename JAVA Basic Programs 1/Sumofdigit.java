import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.split("");
        int[] a = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            sum += a[j];
        }
        System.out.println(sum);
    }
}