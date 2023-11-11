public class CreditPaymentService {
    public int calculate(double c, double m, double s) {
        // Считаем коэффициент аннуитета:
        double k = ((m / 12 / 100) * Math.pow(1 + (m / 12 / 100), s * 12)) / (Math.pow(1 + (m / 12 / 100), s * 12) - 1);
        double x = c * k; // Рассчитываем аннуитентный ежемесячный платеж

        int payMent; // Вводим значение ежемесячного платежа при заданных значениях суммы, срока кредита и годовой ставки по кредиту
        return payMent = (int) x; // Вывод искомого значения ежемесячного платежа по кредиту
    }
}
