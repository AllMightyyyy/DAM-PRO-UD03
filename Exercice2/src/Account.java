public class Account {
    private String name, accountNumber;
    private double balance, interestRate;
    private static int accountID = 1;
    public Account() {
    }
    public Account(String name, String accountNumber, double balance, double interestRate) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        accountID++;
    }
    public Account(Account source) {
        this.name = source.name;
        this.accountNumber = source.accountNumber;
        this.balance = source.balance;
        this.interestRate = source.interestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void deposit(double amount) {
        if(amount >= 0){
            this.setBalance(this.getBalance() + amount);
            System.out.println("SUCCESS");
        } else {
            System.out.println("INVALID AMOUNT");
        }
    }
    public void withdraw(double amount) {
        if(this.getBalance() >= amount){
            this.setBalance(this.getBalance() - amount);
            System.out.println("SUCCESS");
        } else {
            System.out.println("NOT ENOUGH BALANCE");
        }
    }
    public void transfer(Account destinationAccount, double amount) {
        this.setBalance(this.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        System.out.println("SUCCESS");

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
