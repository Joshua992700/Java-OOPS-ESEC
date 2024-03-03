import java.io.*;
import java.util.*;
import java.util.Scanner;
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    
}

public class Solution
{
    public static void main(String []args)
    {
        Adder a = new Adder();
        Scanner sc = new Scanner(System.in);
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        System.out.print(a.add(iNum1,iNum2));
     }
}
