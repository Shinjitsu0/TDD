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
        return (((interestRate / 1200 * (Math.pow((1 + interestRate / 1200), creditTerm))) /
                (Math.pow((1 + interestRate / 1200), creditTerm) - 1)) * creditAmount);
    }

    public double calculateFullAmount() {
        return calculateMonthlyPayment() * creditTerm;
    }

    public double calculateOverpayment() {
        return calculateFullAmount() - creditAmount;
    }

}
