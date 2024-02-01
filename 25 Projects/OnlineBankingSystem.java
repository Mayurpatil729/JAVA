import java.util.Scanner;

class Bank {
    private static final int MAX_ACCOUNTS = 100;
    private String[] accountNumbers;
    private double[] accountBalances;
    private int numAccounts;

    public Bank() {
        this.accountNumbers = new String[MAX_ACCOUNTS];
        this.accountBalances = new double[MAX_ACCOUNTS];
        this.numAccounts = 0;
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (numAccounts < MAX_ACCOUNTS) {
            accountNumbers[numAccounts] = accountNumber;
            accountBalances[numAccounts] = initialBalance;
            numAccounts++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Cannot create more accounts. Limit reached.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            accountBalances[index] += amount;
            System.out.println("Deposit successful. Current balance: " + accountBalances[index]);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            if (accountBalances[index] >= amount) {
                accountBalances[index] -= amount;
                System.out.println("Withdrawal successful. Current balance: " + accountBalances[index]);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public double getBalance(String accountNumber) {
        int index = findAccountIndex(accountNumber);
        return (index != -1) ? accountBalances[index] : -1;
    }

    private int findAccountIndex(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accountNumbers[i].equals(accountNumber)) {
                return i;
            }
        }
        return -1;
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Online Banking System ***");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    double balance = bank.getBalance(accountNumber);
                    if (balance != -1) {
                        System.out.println("Current balance: " + balance);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Online Banking System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
