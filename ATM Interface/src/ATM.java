import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    private final BankAccount account;
    private final ArrayList<Transaction> transactions;

    public ATM(BankAccount account) {
        this.account = account;
        this.transactions = new ArrayList<>();
    }

    public void startATM() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n====================================");
        System.out.println("       SMART ATM SYSTEM");
        System.out.println("====================================");
        System.out.println(" Welcome " + account.getAccountHolder());
        System.out.println("====================================");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != account.getSecurityPin()) {
            System.out.println("Invalid PIN!");
            return;
        }

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Withdraw Funds");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

            
                    case 1:

                        System.out.println("\n===== ACCOUNT DETAILS =====");
                        System.out.println("Account Holder: "
                                + account.getAccountHolder());

                        System.out.println("Account Number: "
                                + account.getAccountNumber());

                        System.out.println("Available Balance: Rs."
                                + account.getAvailableBalance());

                        break;

                    case 2:

                        System.out.println(
                                "Available Balance: Rs."
                                        + account.getAvailableBalance());

                        break;

                    case 3:

                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = sc.nextDouble();

                        account.depositFunds(depositAmount);

                        transactions.add(
                                new Transaction(
                                        "Deposit",
                                        depositAmount));

                        break;

                    case 4:

                        System.out.print("Enter Withdrawal Amount: ");
                        double withdrawAmount = sc.nextDouble();

                        if (account.withdrawFunds(withdrawAmount)) {

                            transactions.add(
                                    new Transaction(
                                            "Withdraw",
                                            withdrawAmount));
                        }

                        break;

                    case 5:

                        System.out.println("\n==============================");
                        System.out.println("      TRANSACTION HISTORY");
                        System.out.println("==============================");

                        if (transactions.isEmpty()) {

                            System.out.println("No Transactions Found");

                        } else {

                            int count = 1;

                            for (Transaction t : transactions) {

                                System.out.print(count + ". ");
                                t.displayTransaction();
                                count++;
                            }
                        }

                        break;

                    case 6:

                        System.out.println("Thank You For Using ATM");
                        break;

                    default:

                        System.out.println("Invalid Choice");
                }
        } while (choice != 6);
    }
}