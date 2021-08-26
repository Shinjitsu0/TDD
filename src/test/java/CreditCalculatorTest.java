import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CreditCalculatorTest {
    long CREDIT_AMOUNT = 100;
    double INTEREST_RATE = 10;
    int CREDIT_TERM = 10;
    CreditCalculator creditCalculator = new CreditCalculator(CREDIT_AMOUNT, INTEREST_RATE, CREDIT_TERM);


    @Test
    public void calculateMonthlyPaymentTest() {
        //given
        double argument = 10.46;
        //when
        final double result = creditCalculator.calculateMonthlyPayment() - argument;
        //then
        Assertions.assertTrue(Math.abs(result) < 0.01);
    }

    @Test
    public void calculateFullAmountTest() {
        //given
        double argument = 104.64;
        //when
        final double result = creditCalculator.calculateFullAmount() - argument;
        //then
        Assertions.assertTrue(Math.abs(result) < 0.01);
    }

    @Test
    public void calculateOverpaymentTest(){
        //given
        double argument = 4.64;
        //when
        final double result = creditCalculator.calculateOverpayment() - argument;
        //then
        Assertions.assertTrue(Math.abs(result) < 0.01);
    }

}
