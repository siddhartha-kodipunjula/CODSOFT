public class BankAccount {

    private final String accountHolder;
    private final String accountNumber;
    private final int securityPin;
    private double availableBalance;

    public BankAccount(String accountHolder,
                       String accountNumber,
                       int securityPin,
                       double availableBalance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.securityPin = securityPin;
        this.availableBalance = availableBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityPin() {
        return securityPin;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void depositFunds(double amount) {

        if (amount > 0) {
            availableBalance += amount;

            System.out.println("\nTransaction Successful");
            System.out.println("Deposited Amount : RS." + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public boolean withdrawFunds(double amount) {
        if (amount > 5000) {

            System.out.println("Withdrawal Limit Exceeded!");
            System.out.println("Maximum Allowed: Rs.5000");

            return false;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return false;
        }

        if (amount > availableBalance) {
            System.out.println("Insufficient Balance");
            return false;
        }

        availableBalance -= amount;

        System.out.println("\nTransaction Successful");
        System.out.println("Withdrawn Amount : RS." + amount);

        return true;
    }
}