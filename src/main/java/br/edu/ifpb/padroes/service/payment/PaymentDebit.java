package br.edu.ifpb.padroes.service.payment;

public class PaymentDebit implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Do debit payment!");
    }
}
