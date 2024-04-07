import java.util.Scanner;
import java.text.DecimalFormat;

class MyTriangle {
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double area(double a, double b, int angleOfAandB) {
        return 0.5 * a * b * Math.sin(angleOfAandB);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double bottom = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area1 = MyTriangle.area(bottom, height);
        System.out.println(df.format(area1));

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int angleOfAandB = scanner.nextInt();
        double area2 = MyTriangle.area(a, b, angleOfAandB);
        System.out.println(df.format(area2));

        scanner.close();
    }
}
