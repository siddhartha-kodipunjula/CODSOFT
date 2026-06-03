import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       CREATE NEW ACCOUNT");
        System.out.println("====================================");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Create 4-Digit PIN: ");
        int pin = sc.nextInt();
        while(pin < 1000 || pin > 9999){
            System.out.println("Invalid PIN!");
            System.out.print("Enter a valid 4-digit PIN: ");
            pin = sc.nextInt();
}

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        BankAccount user =
                new BankAccount(
                        name,
                        "ATM2026001",
                        pin,
                        balance
                );

        System.out.println("\nAccount Created Successfully!");
        System.out.println("Account Number: ATM2026001");

        ATM atm = new ATM(user);

        atm.startATM();
    }
}