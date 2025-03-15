package org.example.lesson10;

public class PaymentImpl implements Payment {

    @Override
    public String pay(int mebleg, String adres, int komissiya) {
        System.out.println("Pul odendi");
        return "Pul odendi";
    }
}
