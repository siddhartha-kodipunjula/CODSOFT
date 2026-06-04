import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            CurrencyConverter converter =
                    new CurrencyConverter();
            
            int choice;
            
            do {
                
                System.out.println("\n==============================");
                System.out.println("     CURRENCY CONVERTER");
                System.out.println("==============================");
                
                System.out.println("1. USD to INR");
                System.out.println("2. INR to USD");
                System.out.println("3. EUR to INR");
                System.out.println("4. INR to EUR");
                System.out.println("5. GBP to INR");
                System.out.println("6. INR to GBP");
                System.out.println("7. Exit");
                
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                
                if (choice >= 1 && choice <= 6) {
                    
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Please enter a valid amount.");
                        continue;
                    }
                    
                    switch (choice) {
                        
                        case 1:
                            System.out.println(
                                    "Converted Amount: Rs." +
                                            converter.usdToInr(amount));
                            break;
                            
                        case 2:
                            System.out.println(
                                    "Converted Amount: $" +
                                            converter.inrToUsd(amount));
                            break;
                            
                        case 3:
                            System.out.println(
                                    "Converted Amount: Rs." +
                                            converter.eurToInr(amount));
                            break;
                            
                        case 4:
                            System.out.println(
                                    "Converted Amount: EUR " +
                                            converter.inrToEur(amount));
                            break;
                            
                        case 5:
                            System.out.println(
                                    "Converted Amount: Rs." +
                                            converter.gbpToInr(amount));
                            break;
                            
                        case 6:
                            System.out.println(
                                    "Converted Amount: GBP " +
                                            converter.inrToGbp(amount));
                            break;
                    }
                }
                
                else if (choice == 7) {
                    
                    System.out.println(
                            "Thank You For Using Currency Converter");
                }
                
                else {
                    
                    System.out.println(
                            "Invalid Choice");
                }
                
            } while (choice != 7);
        }
    }
}