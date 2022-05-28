package com.example.main6;

public class CreditPaymentService {
    public String calculate (int sum, int period, double rate) {
        System.out.println("\nКредит на сумму " + String.format("%,d", sum) + " ₽ на " + period + " год(а) под " + rate + " % годовых.");
        period *= 12; // Перевод срока в месяцы
        rate /= 12 * 100; // Расчет ежемесячной процентной ставки
        double power = Math.pow(1 + rate, period); // Расчет степени
        double multiplier = rate * power / (power - 1); // Расчет коэффициента аннуитета
        int result = (int) Math.round(sum * multiplier); // Расчет аннуитетного платежа с округлением до рублей
        return String.format("%,d", result); // Возврат результата в виде строки с разделителем
    }
}
