public class CreditPaymentService {
    public int calculate(double creditAmount, double monthlyRate, double creditTerm) {
        // Считаем коэффициент аннуитета:
        double coefficientAnnuity = ((monthlyRate / 12 / 100) * Math.pow(1 + (monthlyRate / 12 / 100), creditTerm * 12)) / (Math.pow(1 + (monthlyRate / 12 / 100), creditTerm * 12) - 1);

        // Рассчитываем аннуитентный ежемесячный платеж
        double annuityPayment = creditAmount * coefficientAnnuity;


        int payMent; // Вводим значение ежемесячного платежа при заданных значениях суммы, срока кредита и годовой ставки по кредиту
        return payMent = (int) annuityPayment; // Вывод искомого значения ежемесячного платежа по кредиту
    }
}
