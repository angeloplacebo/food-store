package br.edu.ifpb.padroes.service.payment;

public class PaymentService {
    public PaymentStrategy paymentStrategy;

    public PaymentService(){}

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(){
        this.paymentStrategy.doPayment();
    }

}
