package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    private static final Double DISCOUNT_PAYMENT_DEBIT_CARD = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT_PAYMENT_DEBIT_CARD;
    }
}
