public class CreditPaymentService {
    public int calculate(double c, double m, double s) {
        double k = ((m / 12 / 100) * Math.pow(1 + (m / 12 / 100), s * 12)) / (Math.pow(1 + (m / 12 / 100), s * 12) - 1);
        double x = c * k;
        int payMent;
        return payMent = (int) x;
    }
}
