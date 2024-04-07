public class Main {
    int max = 200;
  
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
  
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
  
    public static void main(String[] args) {
        // Create object with the name myCar
        Main myCar = new Main();
        
        // Call the fullThrottle method
        myCar.fullThrottle();
        
        // Get the maxSpeed and call the speed method
        int maxSpeed = myCar.max;
        myCar.speed(maxSpeed);
    }
}
