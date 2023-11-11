public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double c = 1_000_000; // Ввести сумму кредита (в рублях)
        double m = 9.99; // Ввести месячную процентную ставку по кредиту (годовая ставка по кредиту в %/12/100)
        double s = 2; // Ввести срок кредита (в месяцах)

        int monthPayment = service.calculate(c, m, s);

        System.out.println("При сумме кредита: " + c + " рублей");
        System.out.println("    ставке по кредиту: " + m + " % годовых");
        System.out.println("    сроке кредита: " + s + " год(а)/лет");
        System.out.println("Ежемесячный платеж по кредиту составит: " + monthPayment + " рублей");
    }
}