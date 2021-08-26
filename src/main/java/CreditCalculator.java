public class CreditCalculator {
    private long creditAmount;
    private double interestRate;
    private int creditTerm;

    public CreditCalculator(long creditAmount, double interestRate, int creditTerm) {
        this.creditAmount = creditAmount;
        this.interestRate = interestRate;
        this.creditTerm = creditTerm;
    }

    public double calculateMonthlyPayment() {
        return 0;
    }

    public double calculateFullAmount() {
        return 0;
    }

    public double calculateOverpayment() {
        return 0;
    }

}
