package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {

    private static final Double DISCOUNT_PAYMENT_CREDIT_CARD = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT_PAYMENT_CREDIT_CARD;
    }
}
