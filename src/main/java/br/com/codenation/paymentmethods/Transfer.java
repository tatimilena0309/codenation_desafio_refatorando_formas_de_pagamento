package br.com.codenation.paymentmethods;


public class Transfer implements PriceStrategy {

    private static final Double DISCOUNT_PAYMENT_TRANSFER = 0.92;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT_PAYMENT_TRANSFER;
    }
}
