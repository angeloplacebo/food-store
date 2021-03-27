package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentCredit;
import br.edu.ifpb.padroes.service.payment.PaymentService;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        orderManager.payOrder(new PaymentCredit());
        orderManager.cancelOrder();

    }
}
