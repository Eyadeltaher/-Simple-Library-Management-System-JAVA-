import java.util.ArrayList;
import java.util.Scanner;

public class Borrow {
    static private float borrowingMoneyGained = 0;

    private static void borrowing(Book book) {
        book.setQuantity(book.getQuantity() - 1);
        Borrow.borrowingMoneyGained += book.getRentingPricePerDay();
        System.out.println("you have borrowed the book: " + book.getTitle());
        System.out.println("now you have: " + Borrow.borrowingMoneyGained + "LE");
        System.out.println("and the quantity left is: " + book.getQuantity());
    }

    public static float getBorrowingMoneyGained() {
        return borrowingMoneyGained;
    }

    public static void borrowBook(ArrayList<Book> Booklist) {
        System.out.println("Which Book do you want to borrow ?        (chose by its position)");
        Borrow.listForBorrowing(Booklist);
        System.out.print("I want to borrow: ");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        for (Book book : Booklist) {
            if (book.getBookID() == choice) {
                borrowing(book);
            }
        }
    }

    public static void listForBorrowing(ArrayList<Book> Booklist) {
        for (Book book : Booklist) {
            System.out.println("\nThe title is: " + book.getTitle() + "\nThe borrowing price is: "
                    + book.getRentingPricePerDay() + "\nThe book ID: "
                    + book.getBookID() + "\n");
        }
    }
}
