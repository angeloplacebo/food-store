package br.edu.ifpb.padroes.service.payment;

public class PaymentBillet implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Do billet payment!");
    }
}
