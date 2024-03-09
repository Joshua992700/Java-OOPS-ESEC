abstract class Shape {
    abstract void numberOfSides();
}

class Trapezoid extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Trapezoid has 4 Sides");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 Sides");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 Sides");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        trapezoid.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
