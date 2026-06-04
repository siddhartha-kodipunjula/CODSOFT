public class CurrencyConverter {

    public double usdToInr(double amount) {
        return amount * 86.0;
    }

    public double inrToUsd(double amount) {
        return amount / 86.0;
    }

    public double eurToInr(double amount) {
        return amount * 98.0;
    }

    public double inrToEur(double amount) {
        return amount / 98.0;
    }

    public double gbpToInr(double amount) {
        return amount * 116.0;
    }

    public double inrToGbp(double amount) {
        return amount / 116.0;
    }
}