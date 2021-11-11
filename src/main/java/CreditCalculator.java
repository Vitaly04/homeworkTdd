public class CreditCalculator {

    public double calculationOfMonthlyPayment(double creditAmount, double interestRate, double numberOfPayments) {
        final double TOTALPERCENT = 100;
        final double MONTHSOFJEAR = 12;
        double monthlyInterestRate = interestRate / MONTHSOFJEAR / TOTALPERCENT;
        return (creditAmount * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments))) /
                ((Math.pow((1 + monthlyInterestRate), numberOfPayments)) - 1));
    }

    public double calculationTotalRefundAmount(double creditAmount, double interestRate, double numberOfPayments) {
        double monthlyPayment = calculationOfMonthlyPayment(creditAmount, interestRate, numberOfPayments);
        return monthlyPayment * numberOfPayments;
    }

    public  double calculationOverpayment(double creditAmount, double interestRate, double numberOfPayments) {
        double totalRefundAmount = calculationTotalRefundAmount(creditAmount, interestRate, numberOfPayments);
        return totalRefundAmount - creditAmount;
    }
}
