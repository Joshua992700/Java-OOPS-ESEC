interface A {
    void work1();

    void work2(); // New method added to the interface
}

class AImplementation implements A {
    @Override
    public void work1() {
        System.out.println("Work 1 Completed");
    }

    @Override
    public void work2() {
        System.out.println("Work 2 Completed");
    }
}

public class Main {
    public static void main(String[] args) {
        AImplementation aImpl = new AImplementation();
        aImpl.work1();
        aImpl.work2();
    }
}
