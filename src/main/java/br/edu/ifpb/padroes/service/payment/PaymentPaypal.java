package br.edu.ifpb.padroes.service.payment;

public class PaymentPaypal implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Do paypal payment!");
    }
}
