package br.com.codenation;


import br.com.codenation.paymentmethods.PaymentMethod;

import java.util.Arrays;

public class BillingProcessor {

    public Double calculate(Order order) {
        this.validationMethodPayment(order);
        return order.getPaymentMethod().getPaymentStrategy().calculate(order.getPrice());
    }

    public void validationMethodPayment(Order order) {

        if (Arrays.stream(PaymentMethod.values())
                .noneMatch((t) -> t.name().equals(order.getPaymentMethod().name()))) {
            throw new RuntimeException("Payment method not implemented");
        }
    }
}

