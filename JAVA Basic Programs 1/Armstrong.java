import java.util.Scanner;
import java.lang.Math;

public class ArmstsrongNumberExample {

    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;

        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }

        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        int start,end;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.println("Armstrong number between "+ start +" to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
