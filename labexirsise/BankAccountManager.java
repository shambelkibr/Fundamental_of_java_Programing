package labexirsise;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        System.out.println("** Welcome to Bank Account Manager! **\n");

        // Get initial balance (with try-catch)
        while (true) {
            try {
                System.out.print("Enter your balance: ");
                balance = scanner.nextDouble();
                if (balance < 0) {
                    System.out.println("Error: Balance cannot be negative!");
                    continue;
                }
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }
        }

        while (true) {
            System.out.println("---");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Exit");
            System.out.println("---");

            int choice;
            while (true) {
                try {
                    System.out.print("Enter choice: ");
                    choice = scanner.nextInt();
                    if (choice < 1 || choice > 3) {
                        System.out.println("Error: Choose 1, 2, or 3!");
                        continue;
                    }
                    break; // Valid choice
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a number (1-3)!");
                    scanner.next(); // Clear invalid input
                }
            }

            switch (choice) {
                case 1: // Withdraw
                    while (true) {
                        try {
                            System.out.print("Amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount <= 0) {
                                System.out.println("Error: Amount must be positive!");
                            } else if (withdrawAmount > balance) {
                                System.out.println("Error: Insufficient balance!");
                            } else {
                                balance -= withdrawAmount;
                                System.out.printf("New balance: %.2f\n", balance);
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid amount!");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;

                case 2: // Deposit
                    while (true) {
                        try {
                            System.out.print("Amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            if (depositAmount <= 0) {
                                System.out.println("Error: Amount must be positive!");
                            } else {
                                balance += depositAmount;
                                System.out.printf("New balance: %.2f\n", balance);
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid amount!");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;

                case 3: // Exit
                    System.out.println("Thank you for using the system!");
                    scanner.close();
                    return;
            }
        }
    }
}