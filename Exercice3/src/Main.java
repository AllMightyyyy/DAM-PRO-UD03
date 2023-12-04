import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //let's give the user the ability to add books, show them
        // perform loans and returns
        System.out.println("Welcome to OUR LIBRARY!");
        System.out.println("Please enter the book title: ");
        String title = scanner.nextLine();
        System.out.println("Please enter the author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter the available copies: ");
        int copies = scanner.nextInt();
        System.out.println("Please enter the amount of loaned copies");
        int loanedCopies = scanner.nextInt();
        Book book = new Book(title, author, copies, loanedCopies);
        System.out.println(book.toString());
        System.out.println("do you want to loan this book or return it ?, '1' to loan, '2' to return");
        int number = scanner.nextInt();
        if(number == 1) {
            if(book.loan()) {
                System.out.println(book.toString());
                System.out.println("Thank you for your loan!");
            } else {
                System.out.println(book.toString());
                System.out.println("You have already loaned this book!");
            }
        } else {
            if(book.returnCopy()) {
                System.out.println(book.toString());
                System.out.println("Thank you for your return!");
            } else {
                System.out.println(book.toString());
                System.out.println("You have already returned this book!");
            }
        }

    }
}