class Animal {
    public void eat() {
        System.out.println("Animal Eats");
    }

    public void sleep() {
        System.out.println("Animal Sleeps");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Bird Sleeps");
    }

    public void fly() {
        System.out.println("Bird flies");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
