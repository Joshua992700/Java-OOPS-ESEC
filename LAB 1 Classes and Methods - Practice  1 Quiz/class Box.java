import java.util.Scanner;

public class Box {
    private double width;
    private double height;
    private double depth;

    public void setDimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        double s = Double.parseDouble(parts[0]);
        double d = Double.parseDouble(parts[1]);
        double k = Double.parseDouble(parts[2]);
        Box myBox = new Box();
        myBox.setDimensions(s, d, k);

        // Format the output to display only two decimal places
        String formattedOutput = String.format("%.2f", myBox.getVolume());
        System.out.println(formattedOutput);

        sc.close();
    }
}
