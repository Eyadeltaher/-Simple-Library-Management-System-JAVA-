import java.util.ArrayList;
import java.util.Scanner;

public class Sell {
    static private int sellingMoneyGained = 0;

    private static void selling(Book book) {
        book.setQuantity(book.getQuantity() - 1);
        Sell.sellingMoneyGained += book.getSellPrice();
        System.out.println("you have sold the book: " + book.getTitle());
        System.out.println("now you have: " + Sell.sellingMoneyGained + "LE");
        System.out.println("and the quantity left is: " + book.getQuantity());
    }

    public static void sellBook(ArrayList<Book> Booklist) {
        System.out.println("Which Book do you want to sell ?        (chose by its ID)");
        Sell.listForSelling(Booklist);
        System.out.print("I want to sell: ");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        for (Book book : Booklist) {
            if (book.getBookID() == choice) {
                selling(book);
            }
        }
    }

    public static void listForSelling(ArrayList<Book> Booklist) {
        for (Book book : Booklist) {
            System.out.println("\nThe title is: " + book.getTitle() + "\nThe selling price is: " + book.getSellPrice()
                    + "\nThe book ID is: "
                    + book.getBookID() + "\n");
        }
    }

    public static int getSellingMoneyGained() {
        return sellingMoneyGained;
    }
}
