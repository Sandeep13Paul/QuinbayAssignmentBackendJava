package BankImplementation;

import java.util.Scanner;

// Base Bank class
class Bank {
    protected final double BASE_TRANSACTION_CHARGE = 5.0;
    protected String bankName;

    public Bank(String name) {
        this.bankName = name;
    }

    public double getBaseTransactionCharge() {
        return BASE_TRANSACTION_CHARGE;
    }

    // Making this method abstract forces all child classes to implement it
    protected double calculateTransactionCharge() {
        return BASE_TRANSACTION_CHARGE;
    }

    public String getBankName() {
        return bankName;
    }
}

// ICICI Bank implementation
class ICICI extends Bank {
    private static final double ICICI_CHARGE_MULTIPLIER = 1.10;

    public ICICI() {
        super("ICICI");
    }

    @Override
    public double calculateTransactionCharge() {
        // ICICI takes 10% additional charges on top of the Base Transactional Charges
        return BASE_TRANSACTION_CHARGE * ICICI_CHARGE_MULTIPLIER;
    }
}

// HDFC Bank implementation
class HDFC extends Bank {
    private static final double HDFC_CHARGE_MULTIPLIER = 1.15;

    public HDFC() {
        super("HDFC");
    }

    @Override
    public double calculateTransactionCharge() {
        // HDFC takes 15% additional charges on top of the Base Transactional Charges
        return BASE_TRANSACTION_CHARGE * HDFC_CHARGE_MULTIPLIER;
    }
}

public class BankDemo {
    public static void displayMenu() {
        System.out.println("\n=== Bank Transaction Charges Calculator ===");
        System.out.println("Select a bank:");
        System.out.println("1. ICICI Bank");
        System.out.println("2. HDFC Bank");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                displayMenu();
                int choice = scanner.nextInt();

                if (choice == 3) {
                    System.out.println("Thank you for using our service!");
                    break;
                }

                Bank selectedBank;

                switch (choice) {
                    case 1 -> selectedBank = new ICICI();
                    case 2 -> selectedBank = new HDFC();
                    default -> throw new IllegalArgumentException("Invalid bank choice");
                }

                System.out.println("\nBank: " + selectedBank.getBankName());
                System.out.printf("Base Transaction Charge: ₹%.2f%n", selectedBank.getBaseTransactionCharge());
                System.out.printf("Final Transaction Charge: ₹%.2f%n", selectedBank.calculateTransactionCharge());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}