import java.util.Scanner;

class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice() * 0.8;
        }
    }
}

class Hatchback extends Car {
    int year;
    int manufacturerDiscount;

    Hatchback(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.9;
        }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Speed,regularPrice, color, weight for Truck\n");
        int truckSpeed = scanner.nextInt();
        double truckPrice = scanner.nextDouble();
        String truckColor = scanner.next();
        int truckWeight = scanner.nextInt();

        Truck truck = new Truck(truckSpeed, truckPrice, truckColor, truckWeight);
        System.out.printf("Truck Price %.2f\n", truck.getSalePrice());

        System.out.print("Enter Speed,regularPrice, color, length for Sedan\n");
        int sedanSpeed = scanner.nextInt();
        double sedanPrice = scanner.nextDouble();
        String sedanColor = scanner.next();
        int sedanLength = scanner.nextInt();

        Sedan sedan = new Sedan(sedanSpeed, sedanPrice, sedanColor, sedanLength);
        System.out.printf("Sedan Price %.2f\n", sedan.getSalePrice());

        System.out.print("Enter Speed,regularPrice, color, year, manufacturerDiscount for Hatchback\n");
        int hatchbackSpeed = scanner.nextInt();
        double hatchbackPrice = scanner.nextDouble();
        String hatchbackColor = scanner.next();
        int hatchbackYear = scanner.nextInt();
        int hatchbackDiscount = scanner.nextInt();

        Hatchback hatchback = new Hatchback(hatchbackSpeed, hatchbackPrice, hatchbackColor, hatchbackYear, hatchbackDiscount);
        System.out.printf("Hatchback Price %.2f\n", hatchback.getSalePrice());

        System.out.print("Enter Speed,regularPrice, color for Car\n");
        int carSpeed = scanner.nextInt();
        double carPrice = scanner.nextDouble();
        String carColor = scanner.next();

        Car car = new Car(carSpeed, carPrice, carColor);
        System.out.printf("Basic Car Price %.2f\n", car.getSalePrice());
    }
}
