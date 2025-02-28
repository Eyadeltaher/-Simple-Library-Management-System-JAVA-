import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private int bookID;
    private String author;
    private float sellPrice;
    private float rentingPricePerDay;
    private int quantity;

    public Book() {
    }

    public Book(String title, int bookID, String author, float sellPrice, float rentingPricePerDay, int quantity) {
        this.title = title;
        this.bookID = bookID;
        this.author = author;
        this.sellPrice = sellPrice;
        this.rentingPricePerDay = rentingPricePerDay;
        this.quantity = quantity;
    }
    
    public static void addBook(ArrayList<Book> Booklist) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book title: ");
        book.title = in.nextLine();
        System.out.print("Enter book ID: ");
        book.bookID = in.nextInt();
        in.nextLine();
        System.out.print("Enter book author: ");
        book.author = in.nextLine();
        System.out.print("Enter book selling price: ");
        book.sellPrice = in.nextFloat();
        System.out.print("Enter book borrowing price per day: ");
        book.rentingPricePerDay = in.nextFloat();
        System.out.print("Enter book quantity: ");
        book.quantity = in.nextInt();
        Booklist.add(book);
    }

    public static void removeBook(ArrayList<Book> Booklist) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWhich book do you want to remove?              chose by book ID");
        for (Book book : Booklist) {
            System.out.println("\nThe title is: " + book.getTitle() + "\nThe book ID is: " + book.getBookID() + "\n");
        }
        int choice = in.nextInt();
        for (int count = 0; count<Booklist.size();count++) {
            if (Booklist.get(count).bookID==choice) {
                Booklist.remove(Booklist.get(count));
            }
        }
    }

    public String toString() {
        return ("\nThe title is: " + title + "\nThe book ID is: " + bookID + "\nThe author is: " + author
                + "\nThe selling price is: " + sellPrice + "\nborrowing price per day: "
                + rentingPricePerDay + "\nThe quantity: "
                + quantity + "\n");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return author;
    }

    public void setAuther(String auther) {
        this.author = auther;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getRentingPricePerDay() {
        return rentingPricePerDay;
    }

    public void setRentingPricePerDay(float rentingPricePerDay) {
        this.rentingPricePerDay = rentingPricePerDay;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
