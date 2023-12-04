import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Enter your interest rate: ");
        double interestRate = scanner.nextDouble();
        Account account = new Account(name, accountNumber, balance, interestRate);
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Enter amount to transfer: ");
        System.out.println("Your account detail : " + account.toString());
    }
}