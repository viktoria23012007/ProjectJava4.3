package com.example.main6;

public class Main6 {
    public static void main(String[] args) {
        String payment;
        CreditPaymentService service = new CreditPaymentService();

        payment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽");

        payment = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽");

        payment = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽");
    }
}
