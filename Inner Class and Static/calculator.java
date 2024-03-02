import java.util.Scanner;

public class Calculator{
    public static int power(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }
    public static double powerd(double num1,int num2){
        return Math.pow(num1,num2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int res = Calculator.power(a,b);
        double rest = Calculator.powerd(a,b);
        System.out.println(res);
        System.out.println(rest);
    }
}