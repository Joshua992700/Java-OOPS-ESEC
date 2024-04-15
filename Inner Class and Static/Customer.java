import java.util.Scanner;

public class Main {
    
    static class Address {
        private int door;
        private String street;
        private String city;
        private String dist;
        private String state;
        
        public Address(int door, String street, String city, String dist, String state) {
            this.door = door;
            this.street = street;
            this.city = city;
            this.dist = dist;
            this.state = state;
        }
        
        public String toString() {
            return door + ", " + street + ", " + city + ", " + dist + ", " + state;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(": ");
        int x = Integer.parseInt(n[n.length - 1]);
        for (int i = 0; i < x; i++) {
            String[] n1 = scanner.nextLine().split(": ");
            String name = n1[n1.length - 1];
            String[] n2 = scanner.nextLine().split(": ");
            String number = n2[n2.length-1];
            String n3 = scanner.nextLine();
            String[] n4 = scanner.nextLine().split(": ");
            int door = Integer.parseInt(n4[n4.length - 1]);
            String[] n5 = scanner.nextLine().split(": ");
            String street = n5[n5.length - 1];
            String[] n6 = scanner.nextLine().split(": ");
            String city = n6[n6.length - 1];
            String[] n7 = scanner.nextLine().split(": ");
            String dist = n7[n7.length - 1];
            String[] n8 = scanner.nextLine().split(": ");
            String state = n8[n8.length - 1];
            String n9 = scanner.nextLine();
            String[] n10 = scanner.nextLine().split(": ");
            String doorc = n10[n10.length - 1];
            String[] n11 = scanner.nextLine().split(": ");
            String streetc = n11[n11.length - 1];
            String[] n12 = scanner.nextLine().split(": ");
            String cityc = n12[n12.length - 1];
            String[] n13 = scanner.nextLine().split(": ");
            String distc = n13[n13.length - 1];
            String[] n14 = scanner.nextLine().split(": ");
            String statec = n14[n14.length - 1];
            System.out.println(name + ", " + number);
            System.out.println("Permanent Address : " + new Address(door, street, city, dist, state));
            System.out.println("Communication Address : " + new Address(Integer.parseInt(doorc), streetc, cityc, distc, statec));
        }
    }
}
