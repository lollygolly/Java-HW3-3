/*
X=C*K - аннуитентный платеж
C - сумма кредита
K - коэффициент аннуитета

K=(M*(1+M)^S)/((1+M)^S-1)
M - месячная процентная ставка (годовая ставка/12/100)
S - срок кредита в месяцах
*/

public class Perem {
    public static void main(String[] args) {
        double c = 1_000_000;
        double m = 9.99;
        double s = 1;

        double z = m/12/100;
        double y = s * 12;

        double k = (z * Math.pow(1+z, y))/(Math.pow(1+z, y) - 1);
        System.out.println(k);

        double x = c * k;
        System.out.println(x);

        int payMent = (int) x;
        System.out.println(payMent);
    }
}
