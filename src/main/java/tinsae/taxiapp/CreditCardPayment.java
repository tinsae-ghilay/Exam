package tinsae.taxiapp;

/**
 * Credit card payment method
 * @author Kahsay Tinsae Ghilay
 */
public class CreditCardPayment implements Payment {
    /**
     * Pay method
     */
    @Override
    public void pay() {

        System.out.println("Client paid with credit card");
    }
}
