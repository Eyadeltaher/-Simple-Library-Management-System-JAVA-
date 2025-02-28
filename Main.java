import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book1 = new Book("A Tale of Two Cities",1,"Charles Dickens", 500, 25, 10);
        Book book2 = new Book("Le Petit Prince",2,"Antoine de Saint-Exupéry", 999, 40, 10);
        Book book3 = new Book("Harry Potter and the Philosopher's Stone",3,"J. K. Rowling", 400, 25, 10);
        Book book4 = new Book("War and Peace",4,"Leo Tolstoy", 650, 45, 10);
        Book book5 = new Book("Dune",5,"Frank Herbert", 1200, 80, 25);
        
        ArrayList <Book> Booklist = new ArrayList <>(Arrays.asList(book1,book2,book3,book4,book5));


        while (true) {
            System.out.println("\nHello Sir, What do you need ?             (select by number only)");
            System.out.println("1-book list\n2-sell book\n3-borrow book\n4-Total earing\n5-Add book\n6-remove book\n7-close program\n");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Booklist);
                    break;
                
                case 2:
                    Sell.sellBook(Booklist);
                    break;
                
                case 3:
                    Borrow.borrowBook(Booklist);
                    break;

                case 4:
                    System.out.println("\nThe total earing is: " + (Borrow.getBorrowingMoneyGained()+ Sell.getSellingMoneyGained()) );
                    break;

                case 5:
                    Book.addBook (Booklist);
                    break;

                case 6:
                    Book.removeBook(Booklist);  
                    break;

                case 7:
                    System.out.println("Thank you for using our system. Goodbye!");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;

            }
        }

    }

}
