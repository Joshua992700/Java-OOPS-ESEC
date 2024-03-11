import java.util.Scanner;

abstract class Cake {
    protected String name;
    protected double rate;

    public Cake(String n, double r) {
        name = n;
        rate = r;
    }

    public abstract double calcPrice();

    public String toString() {
        return name + " " + rate;
    }
}

class OrderCake extends Cake {
    private double weight;

    public OrderCake(String n, double r, double w) {
        super(n, r);
        weight = w;
    }

    @Override
    public double calcPrice() {
        return rate * weight;
    }
}

class ReadyMadeCake extends Cake {
    private int quantity;

    public ReadyMadeCake(String n, double r, int q) {
        super(n, r);
        quantity = q;
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cake[] cakes = new Cake[6];

        for (int i = 0; i < 3; i++) {
            String name = scanner.next();
            double rate = scanner.nextDouble();
            double weight = scanner.nextDouble();

            cakes[i] = new OrderCake(name, rate, weight);
        }

        for (int i = 3; i < 6; i++) {
            String name = scanner.next();
            double rate = scanner.nextDouble();
            int quantity = scanner.nextInt();

            cakes[i] = new ReadyMadeCake(name, rate, quantity);
        }

        double totalPrice = 0;

        for (Cake cake : cakes) {
            totalPrice += cake.calcPrice();
        }

        System.out.println("Total Price for all types of cakes: " + (int)totalPrice);
        System.out.println("\nInformation of the cakes that has been sold for the highest price");

        double f = 0;
        double s = 0;
        for (int i = 0; i < 3; i++) {
            f += cakes[i].calcPrice();
        }
        for (int i = 3; i < 6; i++) {
            s += cakes[i].calcPrice();
        }

        if (f > s) {
            for (int i = 0; i < 3; i++) {
                System.out.println(cakes[i]);
            }
        } else {
            for (int i = 3; i < 6; i++) {
                System.out.println(cakes[i]);
            }
        }
    }
}
