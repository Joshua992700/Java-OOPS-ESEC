import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;
  
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
  
    public String getName() {
        return name;
    }
  
    public String getEmail() {
        return email;
    }
  
    public char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
  
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
  
    public String getName() {
        return name;
    }
  
    public Author getAuthor() {
        return author;
    }
  
    public double getPrice() {
        return price;
    }
  
    public void setPrice(double price) {
        this.price = price;
    }
  
    public int getQtyInStock() {
        return qtyInStock;
    }
  
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, Bname, em;
        char sex;
        double price;
        int stock;
        Bname = sc.nextLine();
        name = sc.nextLine();
        em = sc.nextLine();
        sex = sc.next().charAt(0);
        price = sc.nextDouble();
        stock = sc.nextInt();
        Author author = new Author(name, em, sex);
        Book book = new Book(Bname, author, price, stock);
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author MailId: " + author.getEmail());
        System.out.println("Author Gender: " + author.getGender());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
        sc.close();
    }
}