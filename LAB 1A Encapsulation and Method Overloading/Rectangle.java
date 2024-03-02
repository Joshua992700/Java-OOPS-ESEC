import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    private double area;
    private String color;

    // Constructor
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.area = length * width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
        this.area = length * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = this.length * width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first rectangle
        double length1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        String color1 = scanner.next();

        // Input for second rectangle
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        String color2 = scanner.next();

        // Create two rectangle objects
        Rectangle rectangle1 = new Rectangle(length1, width1, color1);
        Rectangle rectangle2 = new Rectangle(length2, width2, color2);

        // Compare the rectangles
        if (rectangle1.getArea() == rectangle2.getArea() && rectangle1.getColor().equals(rectangle2.getColor())) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non matching Rectangles");
        }

        scanner.close();
    }
}
