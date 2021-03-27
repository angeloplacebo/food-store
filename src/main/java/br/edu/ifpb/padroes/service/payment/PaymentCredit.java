package br.edu.ifpb.padroes.service.payment;

public class PaymentCredit implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Do credit card payment!");
    }
}
