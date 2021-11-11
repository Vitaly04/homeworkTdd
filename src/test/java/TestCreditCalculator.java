
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCreditCalculator {

    @Test
    public void testCalculationOfMonthlyPayment() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int actualResult = 46144;
        int expectedResult = (int) creditCalculator.calculationOfMonthlyPayment(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCalculationTotalRefundAmount() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int actualResult = 1107478;
        int expectedResult = (int) creditCalculator.calculationTotalRefundAmount(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void testCalculationOverpayment() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int actualResult = 107478;
        int expectedResult = (int) creditCalculator.calculationOverpayment(1000000.0, 10.0, 24.0);
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
