public class Main {
    public static void main(String[] args) {
        long CREDIT_AMOUNT = 100;
        double INTEREST_RATE = 10;
        int CREDIT_TERM = 10;
        CreditCalculator creditCalculator = new CreditCalculator(CREDIT_AMOUNT, INTEREST_RATE, CREDIT_TERM);
        System.out.println("Ежимесячный платеж = " + creditCalculator.calculateMonthlyPayment());
        System.out.println("Сумма кредита = " + creditCalculator.calculateFullAmount());
        System.out.println("Переплата = " + creditCalculator.calculateOverpayment());
    }
}
